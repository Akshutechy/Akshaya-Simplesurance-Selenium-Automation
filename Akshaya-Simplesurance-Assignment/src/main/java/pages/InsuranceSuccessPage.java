package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class InsuranceSuccessPage extends BasePage {

    public InsuranceSuccessPage(){
        switchToEnglishLanguage();
    }

    private final By languageButton = By.cssSelector("button[aria-label='Menu']>span[class=MuiIconButton-label]");
    private final By englishLanguageButton = By.xpath("//span[normalize-space()='Englisch']");

    private final By insuranceSuccessHeader = By.cssSelector("h2.MuiTypography-h5>span");
    private final By status = By.xpath("//td[.//span[text()='Status']]/following-sibling::td//span");

    public String getInsuranceHeaderText(){
        return getText(insuranceSuccessHeader, WaitStrategy.VISIBLE);
    }

    public String getStatusText(){
        return getText(status, WaitStrategy.VISIBLE);
    }
    private void switchToEnglishLanguage(){
        click(languageButton, WaitStrategy.CLICKABLE, "Language Button");
        click(englishLanguageButton, WaitStrategy.CLICKABLE, "English Language Button");
    }
}