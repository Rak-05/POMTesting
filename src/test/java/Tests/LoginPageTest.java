package Tests;
import Pages.LandingPage;
import Pages.LoginPage;
import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {



    @Test
    public void testLogin() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("ranjithmailedin@gmail.com", "Ranjith@16");

        Assert.assertEquals(driver.getTitle(), "Home Page");

    }





    }


