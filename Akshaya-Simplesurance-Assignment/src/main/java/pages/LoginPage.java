package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

public final class LoginPage {

    private final By emailTextBox = By.id("login_username");
    private final By passwordTextBox = By.id("login_password");
    private final By nextButton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage enterEmailId(String emailId){
        DriverManager.getDriver().findElement(emailTextBox).sendKeys(emailId);
        return this;
    }

    public LoginPage enterPassword(String password){
        DriverManager.getDriver().findElement(passwordTextBox).sendKeys(password);
        return this;
    }

    public HomePage clickNextButton(){
        DriverManager.getDriver().findElement(nextButton).click();
        return new HomePage();
    }

}
