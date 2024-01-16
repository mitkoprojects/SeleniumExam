package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.backend.MainPage;
import pages.backend.RegistrationPage;

public class TestSignIn extends BaseTest {
    @Test
    public void seleniumExam2(){
        MainPage.goToMainPage();
        MainPage.myAccountButton();
        MainPage.chooseRegButton();
        RegistrationPage.enterYourName("Dimitar");
        RegistrationPage.enterYourLastname("Daskalov");
        RegistrationPage.enterYourEmail("mitko.das1914@gmail.com");
        RegistrationPage.enterYourPhone("555555555");
        RegistrationPage.enterPassword("123345");
        RegistrationPage.confirmPassword("123345");
        RegistrationPage.readAndAgreeButton();
        RegistrationPage.regButton();
        RegistrationPage.verifyText("Your Account Has Been Created!");
    }
}
