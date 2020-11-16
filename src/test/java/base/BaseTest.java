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
    protected Driver webDriver;
    protected DashboardPage dashboard;
    protected BaseComponent baseComponent;

    @BeforeClass
    public void setUp(){
        webDriver = new Driver();
//        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
