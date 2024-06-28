package Pages;

import AbstractComponents.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderSuccessPage extends AbstractComponent {

    WebDriver driver;


    public OrderSuccessPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String actualTitle = driver.getTitle();
    String expectedTitle = "Thank you for your purchase!";

}
