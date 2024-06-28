package Pages;

import AbstractComponents.AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends AbstractComponent {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//div[@id='option-label-size-143-item-175']")
     WebElement size;

    @FindBy(id="option-label-color-93-item-53")
    WebElement color;

    @FindBy(id="qty")
    WebElement quantity;

    @FindBy(id="product-addtocart-button")
    WebElement addtocartButton;

    public void pickSize(){
        size.click();
    }

    public void pickColor(){
        color.click();
    }

    public void enterQuantity(){
        quantity.sendKeys("1");
    }



    public void clickOnProduct(String productName) {

        List<WebElement> products = driver.findElements(By.xpath("//strong/a"));
        //            JavascriptExecutor js = (JavascriptExecutor) driver;
        //            js.executeScript("window.scrollBy(0,500)", "");
        for (WebElement product : products) {
            if (product.getText().contains(productName)) {

                product.click();
                break;

            }
        }
    }


}
