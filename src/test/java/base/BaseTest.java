package base;

import org.testng.annotations.BeforeMethod;
import utilities.Browser;

public class BaseTest {
    @BeforeMethod
    public static void setupDriver(){
        Browser.setUp();
    }
}
