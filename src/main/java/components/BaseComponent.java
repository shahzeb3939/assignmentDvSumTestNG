package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ColumnDictionaryPage;

public class BaseComponent {
    private WebDriver driver;
    private By dataCatalog = By.xpath("//span[contains(.,'Data Catalog')]");


    public BaseComponent(WebDriver driver){
        this.driver = driver;
    }

    public void gotoColumn(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(dataCatalog));
        driver.get("https://devqa.dvsum.com/dictionary/column");
    }
}
