package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.MainMenuPage;
import pages.RegistrationPage;


public class RegistrationTest extends BaseTest {

    HomePage homePage;
    RegistrationPage registrationPage;

    @Before
    public void beforeTest() {
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
    }

    //4.	Testirajte registraciju korisnika - pozitivni i negativni testovi!
    @Test
    public void CreateAccount()  {
        homePage.clickCreateAccount();
        registrationPage.createAccount();
    }
    @Test
    public void InvalidInput() {
        homePage.clickCreateAccount();
        registrationPage.invalidInput();
    }
}
