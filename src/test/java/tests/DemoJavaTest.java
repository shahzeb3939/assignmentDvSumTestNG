package tests;

import actions.FirstAction;
import base.BaseTest;
import org.testng.annotations.Test;

public class DemoJavaTest extends BaseTest {

    @Test
    public void demoJavaTest(){
        FirstAction firstAction = new FirstAction(webDriver.getDriver());
        firstAction.firstMethod();

    }
}
