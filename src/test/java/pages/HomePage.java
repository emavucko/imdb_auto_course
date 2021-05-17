package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//div[@id='sidebar']/div[@class='aux-content-widget-2'][1]//div[@class='title']/a")
    public List<WebElement> listOfOpenings;

    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/label[2]/div")
    public WebElement menuButton;

    @FindBy(xpath = "//div[contains(text(),'Sign In')]")
    public WebElement signInButton;

    @FindBy(xpath = "//a[contains(@class,'list-group-item create-account')]")
    public WebElement createAccount;

    @FindBy(className = "imdb-header-search__input")
    public WebElement searchFieldHeader;

    @FindBy(xpath = "//div[contains(text(),'All')]")
    public WebElement searchDropdownAll;

    @FindBy(xpath = "//button[@id='suggestion-search-button']//*[@class='ipc-icon ipc-icon--magnify']")
    public WebElement searchButtonMagnify;

    @FindBy(xpath = "//div[@id='suggestion-search-container']//a[2]")
    public WebElement titlesSection;

    @FindBy(xpath = "//div[@id='suggestion-search-container']//a[4]")
    public WebElement celebsSection;

    @FindBy(xpath = "//div[@class='article']")
    public WebElement searchResultBox;

    @FindBy(xpath = "//div[@class='findSection']")
    public WebElement titlesResults;

    @FindBy(xpath =  "//div[@id='pagecontent']//div[2]//table[1]//tbody[1]//tr[1]")
    public WebElement resultText;

    @FindBy(xpath="//h1[@class='findHeader']")
    public WebElement noResultText;

    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    public WebElement actorLink;

    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    public WebElement movieLink;



    public HomePage listOpeningMovies() {

        for (WebElement opening : listOfOpenings) {
            System.out.println(opening.getText());
        }
        return this;
    }

    public MainMenuPage clickMenuButton() {
        menuButton.click();
        return new MainMenuPage();
    }

    public RegistrationPage clickCreateAccount() {
        signInButton.click();
        createAccount.click();

        return new RegistrationPage();
    }

        public HomePage searchGeneral() {
            searchFieldHeader.sendKeys("The Mask");
            searchButtonMagnify.click();

            return this;
        }

        public HomePage searchTitles() {

            searchFieldHeader.sendKeys("Juno");
            searchDropdownAll.click();
            titlesSection.click();
            searchButtonMagnify.click();

            return this;
        }
        public HomePage searchNoresult() {
            searchDropdownAll.click();
            celebsSection.click();
            searchFieldHeader.sendKeys("Nesto obicno");
            searchButtonMagnify.click();
            return this;

            }

        public ActorFilmography openActorPage() {

            searchFieldHeader.sendKeys("Brad Pitt");
            searchDropdownAll.click();
            celebsSection.click();
            searchButtonMagnify.click();
            actorLink.click();

            return new ActorFilmography();

        }

        public MovieActors openMoviePage(){

        searchFieldHeader.sendKeys("Die Hard");
        searchDropdownAll.click();
        titlesSection.click();
        searchButtonMagnify.click();
        movieLink.click();

        return new MovieActors();
        }

    }



