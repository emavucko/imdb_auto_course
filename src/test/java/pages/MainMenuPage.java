package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainMenuPage extends BaseTest {

public MainMenuPage() { PageFactory.initElements(driver, this);
        }


    @FindBy(xpath = "//a[@role = 'menuitem']")
    public List<WebElement> menuItemsList;

    public String menuList() {

        StringBuilder builder = new StringBuilder();

        for (WebElement listItem : menuItemsList) {
            builder.append(listItem.getText()).append(" ");
        }

            return builder.toString();

        }



    }