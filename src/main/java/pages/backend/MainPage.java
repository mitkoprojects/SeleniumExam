package pages.backend;

import Base.Base;
import org.openqa.selenium.By;

public class MainPage extends Base {
    private final static String LOGIN_PAGE_URL = "https://shop.pragmatic.bg";
    private final static By CLICK_MYACCOUNT_BUTTON = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    private final static By REGISTER_BUTTON = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a");


    public static void goToMainPage() {
        goTo(LOGIN_PAGE_URL);
    }

    public static void myAccountButton() {
        clickOnWebElement(CLICK_MYACCOUNT_BUTTON);
    }

    public static void chooseRegButton() {
        clickOnWebElement(REGISTER_BUTTON);
    }
}



