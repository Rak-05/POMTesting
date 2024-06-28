package TestComponents;

import Pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

public class BaseTest {


    public WebDriver driver;
    LandingPage landingPage;

    @FindBy(id = "top-cart-btn-checkout")
    WebElement proceedToCheckoutButton;

    public WebDriver startDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        return driver;
    }





//    public void clickOnProduct(String productName) {
//
//        List<WebElement> products = driver.findElements(By.xpath("//strong/a"));
//        //            JavascriptExecutor js = (JavascriptExecutor) driver;
//        //            js.executeScript("window.scrollBy(0,500)", "");
//        for (WebElement product : products) {
//            if (product.getText().contains(productName)) {
//
//                product.click();
//
//
//            }
//        }
//    }

    public void cartPage() {
        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
    }


    public void clickOnCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    @BeforeTest(alwaysRun = true)
    public LandingPage launchApplication() {

        driver = startDriver();
        landingPage = new LandingPage(driver);
        landingPage.goTo();
        return landingPage;

    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
