package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class InsuranceDetailsPage extends BasePage {
    public InsuranceDetailsPage(){
        switchToEnglishLanguage();
    }

    private final By languageButton = By.cssSelector("button[aria-label='Menu']>span[class=MuiIconButton-label]");
    private final By englishLanguageButton = By.xpath("//span[normalize-space()='Englisch']");
    private final By insuranceDetailsHeading = By.xpath("//span[normalize-space()='Insurance details']");

    private void switchToEnglishLanguage(){
        click(languageButton, WaitStrategy.CLICKABLE, "Language Button");
        click(englishLanguageButton, WaitStrategy.CLICKABLE, "English Language Button");
    }
}