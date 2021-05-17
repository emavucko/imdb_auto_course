package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class ActorFilmography extends BaseTest {

    public ActorFilmography() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//span[@id='show-actor']")
    public WebElement actorCategoryShow;

    @FindBy(xpath ="//div[@id='filmography']/div[4]")
    WebElement filmographyList;


    public ActorFilmography displayMovies () {
        actorCategoryShow.click();
        return this;
    }


        public String getMovieNames() {
            String names = filmographyList.getText();
            return names;
        }


    }

