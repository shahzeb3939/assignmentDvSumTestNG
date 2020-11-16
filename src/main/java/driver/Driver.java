package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;

    public Driver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
