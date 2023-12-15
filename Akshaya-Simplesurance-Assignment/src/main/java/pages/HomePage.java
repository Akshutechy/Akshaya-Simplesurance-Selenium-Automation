package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class HomePage extends BasePage {

    private final By newButton = By.xpath("//span[contains(text(),'New')]");
    private final By productCountryDropDown = By.id("country-select");
    private final By productNameDropDown = By.id("product-name-select");
    private final By productTariffDropDown = By.id("tariff-name-select");
    private final By productInsuranceCategoryDropDown = By.id("category-name-select");
    private final By productPeriodDropDown = By.id("duration-select");
    private final By productPaymentTypeDropDown = By.id("frequency-select");
    private final By productClassDropDown = By.id("class-name-select");
    private final By productPurchaseDate = By.cssSelector("input[placeholder='dd/mm/yyyy']");
    private final By productSerialNumberTextBox = By.cssSelector("#input-createCertificate_serialNumber");
    private final By productDeviceNameTextBox = By.cssSelector("#input-createCertificate_deviceName");
    private final By productInvoiceNumberTextBox = By.cssSelector("#input-createCertificate_invoiceNumber");
    private final By productOrderNumberTextBox = By.cssSelector("#input-createCertificate_orderNumber");
    private final By nextButton = By.xpath("//span[contains(text(),'Next')]");

    public CreateNewInsurancePage clickNewButton() {
        click(newButton, WaitStrategy.CLICKABLE, "New Button");
        return new CreateNewInsurancePage();
    }
}