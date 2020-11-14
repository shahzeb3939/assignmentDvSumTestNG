package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



import java.util.ArrayList;
import java.util.List;

public class ColumnDictionaryPage {
    private WebDriver driver;
    private By dropdownView = By.id("selectedView");
    private By classListClosed = By.xpath("//div[@class='inline'][not(contains(@style, 'float'))]");
    private By classListOpened = By.xpath("//div[@class='inline open']");
    private By favouriteViews = By.cssSelector("#favouriteViews li");
    private By nonFavouriteViews = By.cssSelector("#viewsCreatedByme li");
    private By favouriteViewButton = By.id("favoriteViewBtn");
    private By refreshViewButton = By.id("refreshViewBtn");
    private List<WebElement> favouriteViewsList;
    private List<WebElement> nonFavouriteViewsList;
    private List<WebElement> viewsList;
    private List<String> favouriteViewsName;
    private List<String> nonFavouriteViewsName;
    private List<String> viewsName;

    private void updateFavouriteViewsList(){
        favouriteViewsList = driver.findElements(favouriteViews);
    }

    private void updateNonFavouriteViewsList(){
        nonFavouriteViewsList = driver.findElements(nonFavouriteViews);
    }

    private void updateViewsList(){
        updateFavouriteViewsName();
        updateNonFavouriteViewsName();
        viewsList = new ArrayList<WebElement>();
        viewsList.addAll(favouriteViewsList);
        viewsList.addAll(nonFavouriteViewsList);
    }

    private void updateFavouriteViewsName(){
        updateFavouriteViewsList();
        favouriteViewsName = new ArrayList<String>();
        for(WebElement listItem:favouriteViewsList){
            favouriteViewsName.add(listItem.getText());
        }
    }

    private void updateNonFavouriteViewsName(){
        updateNonFavouriteViewsList();
        nonFavouriteViewsName = new ArrayList<String>();
        for(WebElement listItem:nonFavouriteViewsList){
            nonFavouriteViewsName.add(listItem.getText());
        }
    }

    private void updateViewsName(){
        updateViewsList();
        viewsName = new ArrayList<String>();
        for(WebElement listItem:viewsList){
            viewsName.add(listItem.getText());
        }
    }

    private void addToFavourite(String favourite){
        nonFavouriteViewsList.forEach((listItem) -> {
            if(listItem.getText().equals(favourite)){
                listItem.click();
                WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.visibilityOfElementLocated(favouriteViewButton));
                driver.findElement(favouriteViewButton).click();
            }
        });
    }

    public ColumnDictionaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void openViewsList(){
        if(driver.findElement(classListClosed).isDisplayed()){
            driver.findElement(dropdownView).click();
        }
    }

    public void markFavourite(String favourite){
        updateViewsName();
        if(!viewsName.contains(favourite)){
            System.out.println("View is not created.");
        } else if(favouriteViewsName.contains(favourite)){
            System.out.println("View is already favourite.");
        } else {
            System.out.println("Adding view to favourite.");
            addToFavourite(favourite);
        }
    }
}
