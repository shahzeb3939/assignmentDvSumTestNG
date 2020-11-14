package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By dataCatalog = By.xpath("//span[contains(.,'Data Catalog')]");
    private By columnDictionaryLink = By.xpath("//a[@href='/dictionary/column']");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDataCatalog(){
        driver.findElement(dataCatalog).click();
    }

    public ColumnDictionaryPage clickColumnDictionary(){
        driver.findElement(columnDictionaryLink).click();
        return new ColumnDictionaryPage(driver);
    }
}
