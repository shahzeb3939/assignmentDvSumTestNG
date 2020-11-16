package actions;

import components.FirstComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstAction {
    private WebDriver driver;
    private By dropdownView = By.id("selectedView");
    private By dataCatalog = By.xpath("//span[contains(.,'Data Catalog')]");



    public FirstAction(WebDriver driver){
        this.driver = driver;
    }
    public void firstMethod() {
        System.out.println("In firstMethod of FirstAction.");
        System.out.println(FirstComponent.firstInteger);

        System.out.println(this.driver.findElement(dataCatalog).getText());
        this.driver.get("https://devqa.dvsum.com/dictionary/column");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        this.driver.findElement(dropdownView).click();


    }
}
