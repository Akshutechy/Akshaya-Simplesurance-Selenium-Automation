package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public final class CreateNewInsurancePage extends BasePage {

    private final By dropDownContainer = By.cssSelector("ul[role='listbox']>li");
    private final By productCountryDropDown = By.id("country-select");
    private final By productNameDropDown = By.id("product-name-select");
    private final By productTariffDropDown = By.id("tariff-name-select");
    private final By productInsuranceCategoryDropDown = By.id("category-name-select");
    private final By productPeriodDropDown = By.id("duration-select");
    private final By productPaymentTypeDropDown = By.id("frequency-select");
    private final By productClassDropDown = By.id("class-name-select");
    private final By productSerialNumberTextBox = By.cssSelector("#input-createCertificate_serialNumber");
    private final By productDeviceNameTextBox = By.cssSelector("#input-createCertificate_deviceName");
    private final By productInvoiceNumberTextBox = By.cssSelector("#input-createCertificate_invoiceNumber");
    private final By productOrderNumberTextBox = By.cssSelector("#input-createCertificate_orderNumber");
    private final By nextButton = By.xpath("//span[contains(text(),'Next')]");
    private final By firstNameTextBox = By.cssSelector("#input-createCertificate_firstName");
    private final By lastNameTextBox = By.cssSelector("#input-createCertificate_lastName");
    private final By emailTextBox = By.cssSelector("#input-createCertificate_email");
    private final By streetTextBox = By.cssSelector("#input-createCertificate_streetName");
    private final By houseNumberTextBox = By.cssSelector("#input-createCertificate_streetNumber");
    private final By postalCodeTextBox = By.cssSelector("#input-createCertificate_zip");
    private final By cityTextBox = By.cssSelector("#input-createCertificate_city");
    private final By countryTextBox = By.cssSelector("#input-createCertificate_country");
    private final By confirmationCheckBox1 = By.xpath("(//input[@type='checkbox'])[1]");
    private final By confirmationCheckBox2 = By.xpath("(//input[@type='checkbox'])[2]");
    private final By confirmationCheckBox3 = By.xpath("(//input[@type='checkbox'])[3]");
    private final By confirmationCheckBox4 = By.xpath("(//input[@type='checkbox'])[4]");
    private final By createInsuranceButton = By.xpath("//span[contains(text(),'Create insurance')]");

   public CreateNewInsurancePage enterNewInsuranceProductDetails(){
       selectNonStaticDropDown(productCountryDropDown, dropDownContainer,"Country Drop Down","Germany");
       selectNonStaticDropDown(productNameDropDown, dropDownContainer,"Product Name Drop Down","Nokia_v1Allianz_global");
       selectNonStaticDropDown(productTariffDropDown, dropDownContainer,"Tariff Drop down","1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage");
       selectNonStaticDropDown(productInsuranceCategoryDropDown, dropDownContainer,"Insurance Category Drop down","CATEGORY_SMARTPHONE");
       selectNonStaticDropDown(productPeriodDropDown, dropDownContainer,"Period Drop down","12 month(s)");
       selectNonStaticDropDown(productPaymentTypeDropDown, dropDownContainer,"Payment Type Drop down","One-time");
       selectNonStaticDropDown(productClassDropDown, dropDownContainer,"Payment Type Drop down","Nokia 5/500 - EUR 500.00");
       sendKeys(productSerialNumberTextBox, "123456", WaitStrategy.PRESENT, "Serial Number Box");
       sendKeys(productDeviceNameTextBox, "Nokia Device", WaitStrategy.PRESENT, "Device Name Box");
       sendKeys(productInvoiceNumberTextBox, "1234567890", WaitStrategy.PRESENT, "Invoice Number Box");
       sendKeys(productOrderNumberTextBox, "0123456", WaitStrategy.PRESENT, "Order Number Box");
       return this;
    }

    public CreateNewInsurancePage clickNextButton() {
        click(nextButton, WaitStrategy.CLICKABLE, "New Button");
        return this;
    }

    public CreateNewInsurancePage enterNewInsuranceCustomerDetails(){
        sendKeys(firstNameTextBox, "Akshaya", WaitStrategy.PRESENT, "First Name Box");
        sendKeys(lastNameTextBox, "Narayanan", WaitStrategy.PRESENT, "Last Name Box");
        sendKeys(emailTextBox, "akshaya.n@gmail.com", WaitStrategy.PRESENT, "Email Id Box");
        sendKeys(streetTextBox, "Martin Reisenburger", WaitStrategy.PRESENT, "Street Name Box");
        sendKeys(houseNumberTextBox, "44", WaitStrategy.PRESENT, "House Number Box");
        sendKeys(postalCodeTextBox, "12001", WaitStrategy.PRESENT, "Postal Code Box");
        sendKeys(cityTextBox, "Berlin", WaitStrategy.PRESENT, "City Name Box");
        sendKeys(countryTextBox, "DE", WaitStrategy.PRESENT, "Country Name Box");
        return this;
    }

    public CreateNewInsurancePage confirmAllCheckboxes(){
        selectCheckbox(confirmationCheckBox1, "Confirmation Checkbox 1");
        selectCheckbox(confirmationCheckBox2, "Confirmation Checkbox 2");
        selectCheckbox(confirmationCheckBox3, "Confirmation Checkbox 3");
        selectCheckbox(confirmationCheckBox4, "Confirmation Checkbox 4");
        return this;
    }

    public PaymentPage clickCreateInsuranceButton() {
        click(createInsuranceButton, WaitStrategy.CLICKABLE, "Create Insurance Button");
        return new PaymentPage();
    }
}