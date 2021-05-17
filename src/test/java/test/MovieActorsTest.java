package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.MovieActors;

import java.util.Arrays;


public class MovieActorsTest extends BaseTest {

    public MovieActorsTest() {
        PageFactory.initElements(driver, this);
    }

    HomePage homePage;
    MovieActors movieActors;

    @Before
    public void SetUpPage() {

        homePage = new HomePage();

        movieActors = new MovieActors();

    }

    //7. 1.	Proverite mi da li su se sledeći glumci pojavili u filmu Die Hard (nastavci se takođe računaju)
    //○	Nicolas Cage
    //○	Bruce Willis
    //○	Ricky Martin
    //○	Samuel L. Jackson
    @Test
    public void SearchActorsInMovie() {

        String actor1 = "Nicolas Cage";
        String actor2 = "Bruce Willis";
        String actor3 = "Ricky Martin";
        String actor4 = "Samuel L. Jackson";
        homePage.openMoviePage();
        movieActors.displayActors();
        String actorNames = movieActors.getActorNames();



        Assert.assertFalse("Actor" + actor1 + " did not play in Die Hard movie" , actorNames.contains(actor1));
        Assert.assertTrue("Actor" + actor2 + " did not play in Die Hard movie" , actorNames.contains(actor2));
        Assert.assertFalse("Actor" + actor3 + " did not play in Die Hard movie" , actorNames.contains(actor3));
        Assert.assertFalse("Actor" + actor4 + " did not play in Die Hard movie" , actorNames.contains(actor4));

        }

    }