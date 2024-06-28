    package Pages;

    import AbstractComponents.AbstractComponent;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.ui.Select;

    public class CheckoutAddressPage extends AbstractComponent {

        WebDriver  driver;

        public CheckoutAddressPage(WebDriver driver) {

            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }



    @FindBy(xpath = "//div/input[@id='I81JX1A']")
        WebElement addressLine;

    @FindBy(xpath = "//div/input[@id='VU4AN5X']")
        WebElement city;

    @FindBy(xpath = ".//select[@id='ETFE99O']")
        WebElement provinces;

    @FindBy(xpath = ".//select[@id='S5T5S8H']")
        WebElement phoneNUmber;

    @FindBy(xpath = ".//select[@id='K2Q79LP']")
        WebElement postalCode;

    @FindBy(xpath = ".//select[@id='U8T0PCS']")
        WebElement countrys;

    @FindBy(xpath = ".//input[@name='ko_unique_2']")
    WebElement shippingRadio;


    public void selectProvince(String province) {

        Select select = new Select(provinces);
        select.selectByValue(province);

    }

    public void enterCity() {
        city.sendKeys("Salem city");


    }

    public void enterAddress() {
        addressLine.sendKeys("No20 arixona state line");

    }


    public void enterPhoneNUmber() {
    phoneNUmber.sendKeys("+7(90)");

    }

    public void selectShippingMethod(){

    shippingRadio.click();
    }

    public void selectCountry(String country) {

        Select select = new Select(countrys);
        select.selectByValue(country);

    }

    public void enterPostalCode() {

    postalCode.sendKeys("+44464");
    }


}
