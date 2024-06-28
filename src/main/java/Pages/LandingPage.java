package Pages;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {

    WebDriver driver;
    LoginPage loginPage;
    public LandingPage(WebDriver driver) {
            super(driver);
            this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//li/a[contains (text(),'Sign In')]")
    WebElement SignInButton;

    @FindBy(partialLinkText = "Create an account")
    WebElement createNewAccountButton;

    @FindBy(id="ui-id-5")
    WebElement menSection;

    public void  clickLoginButton()
    {
        SignInButton.click();


    }

    public void gotoMenSection(){

        menSection.click();

    }


    public void goTo(){
        driver.get("https://magento.softwaretestingboard.com/");

    }

}
