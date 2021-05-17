package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage extends BaseTest {



    @FindBy(id = "ap_customer_name")
    public WebElement yourName;

    @FindBy(id="ap_email")
    public WebElement email;

    @FindBy(id="ap_password")
    public WebElement password;

    @FindBy(id="ap_password_check")
    public WebElement reenterPassword;

    @FindBy(id="ap_email")
    public WebElement createAccountButton;

    public HomePage createAccount() {
        yourName.sendKeys("nesto");
        email.sendKeys("ema.v+1@connectik.com");
        password.sendKeys("12345678");
        reenterPassword.sendKeys("12345678");
        createAccountButton.click();

        return new HomePage();

    }

    public RegistrationPage invalidInput(){
        yourName.sendKeys("nesto");
        email.sendKeys("ema.v+1@connectik.com");
        password.sendKeys("12345678");
        reenterPassword.sendKeys("12345679");
        createAccountButton.click();

        return this;
    }
}
