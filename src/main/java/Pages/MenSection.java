package Pages;

import AbstractComponents.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenSection extends AbstractComponent {

WebDriver driver;

public MenSection(WebDriver driver) {
    super(driver);
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//button[@class=\"action search\"]")
WebElement searchButton;

@FindBy(id="search")
WebElement searchBox;

public void searchProduct(String productName){
     searchBox.sendKeys(productName);
}

public void clickSearchButton(){
    searchButton.click();
    //searchBox.SendKeys(Keys.RETURN);
}






}
