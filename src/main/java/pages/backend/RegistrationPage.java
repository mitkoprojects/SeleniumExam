package pages.backend;

import Base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.Browser;

public class RegistrationPage extends Base {
    private final static By FIRST_NAME_INPUT = By.id("input-firstname");
    private final static By LAST_NAME_INPUT = By.id("input-lastname");
    private final static By EMAIL_INPUT = By.id("input-email");
    private final static By PHONE_INPUT = By.id("input-telephone");
    private final static By PASSWORD_INPUT = By.id("input-password");
    private final static  By CONFIRM_PASSWORD_INPUT = By.id("input-confirm");
    private final static By READ_AND_AGREE_BUTTON = By.xpath("//*[@id='content']/form/div/div/input[1]");
    private final static By REGISTRATION_BUTTON = By.className("btn-primary");
    public static void enterYourName(String firstname){
        writeOnWebElement(FIRST_NAME_INPUT, firstname);
    }
    public static void enterYourLastname(String lastname){
        writeOnWebElement(LAST_NAME_INPUT, lastname);
    }
    public static void enterYourEmail(String email){
        writeOnWebElement(EMAIL_INPUT, email);
    }
    public static void enterYourPhone(String phone){
        writeOnWebElement(PHONE_INPUT, phone);
    }
    public static void enterPassword(String password){
        writeOnWebElement(PASSWORD_INPUT, password);
    }
    public static void confirmPassword(String password){
        writeOnWebElement(CONFIRM_PASSWORD_INPUT, password);
    }
    public static void readAndAgreeButton(){
        clickOnWebElement(READ_AND_AGREE_BUTTON);
    }
    public static void regButton(){
        clickOnWebElement(REGISTRATION_BUTTON);
    }
    public static void verifyText(String text){
        String name = Browser.getDriver().findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        Assert.assertEquals(name, text);
    }
}

