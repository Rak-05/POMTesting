package Tests;

import Pages.LandingPage;
import Pages.ProductPage;
import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {


    @Test
    public void checkProduct() throws InterruptedException {
  //  LandingPage landingPage = new LandingPage(driver);
    ProductPage productPage = new ProductPage(driver);
        driver.findElement(By.id("search")).sendKeys("pant");
                WebElement searchButton = driver.findElement(By.id("search"));
        searchButton.sendKeys(Keys.RETURN);
    productPage.clickOnProduct("Zeppelin Yoga Pant");
    productPage.pickColor();
    productPage.pickSize();
    productPage.enterQuantity();
    }





}
