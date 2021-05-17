package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.ActorFilmography;
import pages.HomePage;

import java.util.List;

public class ActorFilmographyTest extends BaseTest {

    public ActorFilmographyTest() {
        PageFactory.initElements(driver, this);
    }

    HomePage homePage;
    ActorFilmography actorFilmography;

    @Before
    public void SetUpPage() {

        homePage = new HomePage();

        actorFilmography = new ActorFilmography();


    }

    //6.	Proverite da li u filmografiji određenog glumca/glumice postoji neki film za koji znate da je glumio/glumila u njemu.
    // (na primer The Godfather -> Al Pacino).

    @Test
    public void SearchActorFilmography() throws Exception {
        String movie="Babel";
        homePage.openActorPage();
        actorFilmography.displayMovies();
        Thread.sleep(1000);
        Assert.assertTrue("Movie \"Babel\" not found in list of Movies", actorFilmography.getMovieNames().contains(movie));

    }




}