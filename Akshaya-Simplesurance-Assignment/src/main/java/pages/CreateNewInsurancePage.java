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

   public CreateNewInsurancePage enterNewInsuranceProductDetails(String countryName, String productName, String tariff, String insuranceCategory, String period, String paymentType, String productClass, String serialNo, String deviceName, String invoiceNo, String orderNo){
       selectNonStaticDropDown(productCountryDropDown, dropDownContainer,"Country Drop Down",countryName);
       selectNonStaticDropDown(productNameDropDown, dropDownContainer,"Product Name Drop Down",productName);
       selectNonStaticDropDown(productTariffDropDown, dropDownContainer,"Tariff Drop down",tariff);
       selectNonStaticDropDown(productInsuranceCategoryDropDown, dropDownContainer,"Insurance Category Drop down",insuranceCategory);
       selectNonStaticDropDown(productPeriodDropDown, dropDownContainer,"Period Drop down",period);
       selectNonStaticDropDown(productPaymentTypeDropDown, dropDownContainer,"Payment Type Drop down",paymentType);
       selectNonStaticDropDown(productClassDropDown, dropDownContainer,"Product Class",productClass);
       sendKeys(productSerialNumberTextBox, serialNo, WaitStrategy.PRESENT, "Serial Number Box");
       sendKeys(productDeviceNameTextBox, deviceName, WaitStrategy.PRESENT, "Device Name Box");
       sendKeys(productInvoiceNumberTextBox, invoiceNo, WaitStrategy.PRESENT, "Invoice Number Box");
       sendKeys(productOrderNumberTextBox, orderNo, WaitStrategy.PRESENT, "Order Number Box");
       return this;
    }

    public CreateNewInsurancePage clickNextButton() {
        click(nextButton, WaitStrategy.CLICKABLE, "New Button");
        return this;
    }

    public CreateNewInsurancePage enterNewInsuranceCustomerDetails(String firstName, String lastName, String email, String streetName, String houseNumber, String postalCode, String cityName, String countryCode){
        sendKeys(firstNameTextBox, firstName, WaitStrategy.PRESENT, "First Name Box");
        sendKeys(lastNameTextBox, lastName, WaitStrategy.PRESENT, "Last Name Box");
        sendKeys(emailTextBox, email, WaitStrategy.PRESENT, "Email Id Box");
        sendKeys(streetTextBox, streetName, WaitStrategy.PRESENT, "Street Name Box");
        sendKeys(houseNumberTextBox, houseNumber, WaitStrategy.PRESENT, "House Number Box");
        sendKeys(postalCodeTextBox, postalCode, WaitStrategy.PRESENT, "Postal Code Box");
        sendKeys(cityTextBox, cityName, WaitStrategy.PRESENT, "City Name Box");
        sendKeys(countryTextBox, countryCode, WaitStrategy.PRESENT, "Country Name Box");
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