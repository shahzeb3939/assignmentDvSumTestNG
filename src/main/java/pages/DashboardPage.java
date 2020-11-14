package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    private By firstDot = By.xpath("//i[@class='fa fa-ellipsis-h white bigger-150 pull-right']");
    private By secondDot = By.xpath("//i[@class='fa fa-ellipsis-h blue bigger-200 uv-ellipses-icon']");

    public void clickFirst(){
        driver.findElement(firstDot).click();
    }

    public void clickSecond(){
        driver.findElement(secondDot).click();
    }
}
