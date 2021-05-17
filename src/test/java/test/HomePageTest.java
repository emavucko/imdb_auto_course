package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;

import java.util.List;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @Before
    public void SetUpPage() {
        homePage = new HomePage();
    }

    //1.Za početak u konzoli ispišite listu filmova koji počinju s prikazivanjem ove nedelje -
// Opening this week deo - desni deo početne strane:

    @Test
    public void ListOfOpenings() {
        homePage.listOpeningMovies();
    }


    //2.	Proverite da li Opening this week list sadrzi tacno 8 naslova.

    @Test
    public void NumberOfOpenings() throws InterruptedException {

        Assert.assertEquals("List has invalid number of elements", 8, homePage.listOfOpenings.size());



    }


   // 5.Testirajte funkciju pretraživanja -
    // Vrh početne strane Potrebno je da koristite i oblast pretrage ( All, Titles, TV Episodes, itd.).
    // da imate različite upite za pretragu, različite oblasti pretrage
    //	Takođe, želim da vidim najmanje jedan test koji će prikazati rezultate i jedan koji neće imati nijedan rezultat.
    //  Kao rezultat testa želim da vidim validaciju da li se određeni pojam nalazi u delu sa rezultatima
    // (na primer, ako pretražujete Die Hard, želim validaciju da li se Die Hard film spominje u okviru rezultata pretrage - ne na celoj stranici!).

    @Test
    public void SearchGeneralResult() {
        homePage.searchGeneral();
        Assert.assertTrue("Search term is not found in results", homePage.searchResultBox.getText().contains("The Mask"));
    }
    @Test
    public void SearchTitlesResult() {
        homePage.searchTitles();
        Assert.assertTrue("Search term is not found in results", homePage.titlesResults.getText().contains("Juno"));
    }

    @Test
    public void SearchNoResult() {
        homePage.searchNoresult();
        Assert.assertTrue("Search term found in results", homePage.searchResultBox.getText().contains("No results found for \"Nesto obicno\""));
    }
}














    /*
    @Test
    public void Registration() {

        Assert.assertEquals("TEKST ZA VALIDACIJU", FirstPage.METODA1());



}
    */