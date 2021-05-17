package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.MainMenuPage;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class MainMenuTest extends BaseTest {

    MainMenuPage mainMenuPage;
    HomePage homePage;

    @Before
    public void beforeTest() {
        homePage = new HomePage();
        mainMenuPage = new MainMenuPage();
    }

 /*   1.	Na vrhu početne strane se nalazi se meni. Vaš zadatak je da proverite da li meni sadrži sledeće sekcije:
            ○	TV News
○	Born Today
○	Movie News
○	Cartoon News
*/

    @Test
    public void MainMenuList()  {

        List<String> expectedItems = new ArrayList<String>();
        expectedItems.add("TV News");
        expectedItems.add("Born Today");
        expectedItems.add("Movie News");
        expectedItems.add("Cartoon News");

        String menu = homePage.clickMenuButton()
                .menuList();


        for (String item : expectedItems) {
            Assert.assertTrue("Item: " +item + " not found",menu.contains(item));
        }


    }


}


