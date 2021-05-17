package pages;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;


public class MovieActors extends BaseTest {

    public MovieActors() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div[5]/div[1]/div/div/div[2]/div[1]/div[4]/a[4]")
    public WebElement fullCastLink;


    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div[3]/div[1]/div[1]/div[2]/table[3]")
    WebElement actorsList;




   public MovieActors displayActors() {
        fullCastLink.click();
        return this;
    }

    public String getActorNames() {
        String actors = actorsList.getText();
        return actors;


    }


}