package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage {

    public LoginPage(){
        switchToEnglishLanguage();
    }

    private final By emailTextBox = By.id("login_username");
    private final By passwordTextBox = By.id("login_password");
    private final By nextButton = By.xpath("//button[@type=\"submit\"]");
    private final By languageButton = By.cssSelector("button[aria-label='Menu']>span[class=MuiIconButton-label]");
    private final By englishLanguageButton = By.xpath("//span[normalize-space()='Englisch']");

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

    private void switchToEnglishLanguage(){
        click(languageButton, WaitStrategy.CLICKABLE, "Language Button");
        click(englishLanguageButton, WaitStrategy.CLICKABLE, "English Language Button");
    }

}
