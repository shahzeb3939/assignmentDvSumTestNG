package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected DashboardPage dashboard;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://devqa.dvsum.com/login");

        LoginPage login = new LoginPage(driver);
        login.setEmail("testautomation@dvsum.com");
        login.setPassword("1@Qwerty");
        login.clickLogin();

        dashboard = new DashboardPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
