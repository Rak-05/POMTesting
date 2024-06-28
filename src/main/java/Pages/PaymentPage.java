package Pages;

import AbstractComponents.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends AbstractComponent {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="class=\"action primary checkout\"")
    WebElement orderClickButton;

    public void clickOrderButton() {
        orderClickButton.click();
    }


}
