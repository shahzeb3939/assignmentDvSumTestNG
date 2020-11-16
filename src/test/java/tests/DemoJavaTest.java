package tests;

import actions.FirstAction;
import base.BaseTest;
import org.testng.annotations.Test;

public class DemoJavaTest extends BaseTest {

    @Test
    public void demoJavaTest(){
        FirstAction.firstMethod();
        webDriver.getDriver().get("https://www.google.com/");
    }
}
