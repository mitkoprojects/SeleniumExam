package Base;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.Browser;

public class Base {
    protected static void goTo(String url){
        Browser.getDriver().get(url);
    }
    protected static void clickOnWebElement(By locator){
        Browser.getDriver().findElement(locator).click();
    }
    protected static void writeOnWebElement(By locator, String text){
        Browser.getDriver().findElement(locator).sendKeys(text);
    }
    protected static void verifyElementIsPresent(By locator){
        Assert.assertTrue(Browser.getDriver().findElement(locator).isDisplayed());
    }

}
