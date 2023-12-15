import com.github.javafaker.Faker;
import enums.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsuranceSuccessPage;
import pages.LoginPage;
import utils.ReadPropertyFile;

import java.util.Locale;

public final class createSingleInsuranceTest extends BaseTest {
    Locale locale = Locale.of("en", "IN");
    Faker fake = new Faker(locale);

    String countryName = "Germany",
            productName = "Nokia_v1Allianz_global",
            tariff = "1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage",
            insuranceCategory = "CATEGORY_SMARTPHONE",
            period = "12 month(s)",
            paymentType = "One-time",
            productClass = "Nokia 5/500 - EUR 500.00",
            serialNo = "123456",
            deviceName = "Nokia Device",
            invoiceNo = "1234567890",
            orderNo = "0123456";
    String firstName = fake.name().firstName(),
            lastName = fake.name().lastName(),
            email = fake.internet().emailAddress(),
            streetName = fake.address().streetName(),
            houseNumber = fake.address().buildingNumber(),
            postalCode = fake.address().zipCode(),
            cityName = fake.address().cityName(),
            countryCode = fake.address().countryCode();

    String cardNumber = "4242424242424242",
    expiryDate = "1024",
    cvv = "206";


    @Test
    public void createSingleInsurancePolicy() throws InterruptedException {
        LoginPage lp = new LoginPage();
        InsuranceSuccessPage isp = lp.loginAndRoutToHomePage(ReadPropertyFile.getValue(ConfigProperties.EMAILID),ReadPropertyFile.getValue(ConfigProperties.PASSWORD))
                .clickNewButton()
                .enterNewInsuranceProductDetails(countryName, productName, tariff, insuranceCategory, period, paymentType, productClass, serialNo, deviceName, invoiceNo, orderNo)
                .clickNextButton()
                .enterNewInsuranceCustomerDetails(firstName, lastName, email, streetName, houseNumber, postalCode, cityName, countryCode)
                .clickNextButton()
                .confirmAllCheckboxes()
                .clickCreateInsuranceButton()
                .clickContinueToPaymentButton()
                .enterCardDetails(cardNumber,expiryDate,cvv)
                .clickOrderButton();
        Assert.assertEquals(isp.getInsuranceHeaderText(), "Insurance details");
        Assert.assertEquals(isp.getStatusText(), "Created");
    }
}
