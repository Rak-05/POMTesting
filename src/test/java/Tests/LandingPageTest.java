package Tests;

import Pages.LandingPage;
import TestComponents.BaseTest;
import org.testng.annotations.Test;

public class LandingPageTest  extends BaseTest {


    @Test
    public void CheckLoginClick() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();


    }

    @Test
    public void checkMensClick(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
        landingPage.gotoMenSection();

    }

}


