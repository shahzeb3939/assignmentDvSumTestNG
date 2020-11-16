package base;

import components.BaseComponent;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public Driver webDriver;
    protected DashboardPage dashboard;
    protected BaseComponent baseComponent;

    @BeforeClass
    public void setUp(){
        webDriver = new Driver();
//        webDriver.getDriver().manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
//        webDriver.getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        webDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.getDriver().get("https://devqa.dvsum.com/login");

        LoginPage login = new LoginPage(webDriver.getDriver());
        login.setEmail("testautomation@dvsum.com");
        login.setPassword("1@Qwerty");
        login.clickLogin();

        dashboard = new DashboardPage(webDriver.getDriver());
        baseComponent = new BaseComponent(webDriver.getDriver());
    }
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }

}
