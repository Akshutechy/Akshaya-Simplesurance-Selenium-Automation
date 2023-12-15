package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class PaymentPage extends BasePage {

    private final By continueToPayment = By.cssSelector("button[type=\"button\"]");
    private final By paymentFrame = By.xpath("//iframe[contains(@name,'privateStripeFrame')]");
    private final By parentFrame = By.xpath("//iframe[contains(@name,'privateStripeFrame')]");
    private final By cardNumberTextBox = By.cssSelector("div.CardNumberField-input-wrapper input");
    private final By cardExpiryTextBox = By.xpath("//span[contains(@class,\"CardField-expiry\")]//input");
    private final By cardCVCTextBox = By.xpath("//span[contains(@class,\"CardField-cvc\")]//input");
    private final By orderButton = By.cssSelector("button[type=\"button\"]:nth-child(1)");

    public PaymentPage clickContinueToPaymentButton() {
       waitForDuration(5000);
        forceClick(continueToPayment, "Continue To Payment Button");
        return this;
    }

    public PaymentPage enterCardDetails(String cardNumber, String expiryDate, String cardCvc){
        waitForDuration(7000);
        switchToFrame(paymentFrame,WaitStrategy.PRESENT);
        sendKeysSlowType(cardNumberTextBox,cardNumber, WaitStrategy.PRESENT, "Card Number");
        sendKeysSlowType(cardExpiryTextBox,cardNumber, WaitStrategy.PRESENT, "Card Expiration Date");
        sendKeysSlowType(cardCVCTextBox,cardNumber, WaitStrategy.PRESENT, "Card CVC");
        switchToParentFrame();
        return this;
    }

    public InsuranceSuccessPage clickOrderButton() {
        forceClick(orderButton, "Create Order Button");
        return new InsuranceSuccessPage();
    }
}