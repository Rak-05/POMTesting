package Pages;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponent {

    WebDriver driver;
    LandingPage landingPage;

    @FindBy(id = "email" )
    WebElement emailField;

    @FindBy(id = "pass" )
    WebElement pwField;

    @FindBy(id = "send2" )
    WebElement signButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void login(String email, String password){
        emailField.sendKeys(email);
        pwField.sendKeys(password);
        signButton.click();
        LandingPage landingPage = new LandingPage(driver);

    }

    public void goTo(){

        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
    }


}
