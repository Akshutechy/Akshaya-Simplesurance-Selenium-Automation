package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import reports.ExtentLogger;
import reports.ExtentManager;
import reports.ExtentReport;

public final class LoginPage extends BasePage {

    private final By emailTextBox = By.id("login_username");
    private final By passwordTextBox = By.id("login_passwords");
    private final By nextButton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage enterEmailId(String emailId){
        sendKeys(emailTextBox, emailId, WaitStrategy.PRESENT, "Email Id");
        return this;
    }

    public LoginPage enterPassword(String password){
        sendKeys(passwordTextBox,password, WaitStrategy.PRESENT, "Password");
        return this;
    }

    public HomePage clickNextButton(){
        click(nextButton, WaitStrategy.CLICKABLE, "Next Button");
        return new HomePage();
    }

}
