package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public final class HomePage extends BasePage {

    private final By newButton = By.xpath("//span[contains(text(),'New')]");
    private final By searchForDropDown = By.cssSelector("div.MuiSelect-selectMenu");
    private final By policyNumberSearchTextBox = By.xpath("//input[@type='text']");
    private final By emailIdSearchTextBox = By.xpath("//input[@type='email']");
    private final By dropDownContainer = By.cssSelector("ul[role='listbox']>li");
    private final By policyNumberAccordion = By.xpath("//th[@data-sort='POLICY_NUMBER']//*[name()='svg']");
    private final By activationDateAccordion = By.xpath("//th[@data-sort='ACTIVATED_AT']//*[name()='svg']");
    private final By policyNumberList = By.xpath("//table[@data-testid=\"policy-list\"]/tbody/tr/th[1]//span[1]");
    private final By searchResultPolicyNumberValue = By.xpath("//table[@data-testid=\"policy-list\"]/tbody/tr[1]/th[1]//span[1]");
    private final By searchResultEmailValue = By.xpath("//table[@data-testid=\"policy-list\"]/tbody/tr[1]/th[3]");
    private final By activationDateList = By.xpath("//table[@data-testid=\"policy-list\"]/tbody/tr/th[4]//span[1]");

    public CreateNewInsurancePage clickNewButton() {
        click(newButton, WaitStrategy.CLICKABLE, "New Button");
        return new CreateNewInsurancePage();
    }

    public HomePage clickPolicyNumberAccordion() {
        waitForDuration(3000);
        click(policyNumberAccordion, WaitStrategy.CLICKABLE, "Policy Number Accordion Button");
        return this;
    }

    public HomePage clickActivationDateAccordion() {
        waitForDuration(3000);
        click(activationDateAccordion, WaitStrategy.CLICKABLE, "Activation Date Accordion Button");
        return this;
    }

    public List<String> getTextAllPolicyNumber(){
        return getTextForListOfElements(policyNumberList, WaitStrategy.PRESENT);
    }

    public List<String> getTextAllActivationDate(){
        return getTextForListOfElements(activationDateList, WaitStrategy.PRESENT);
    }

    public HomePage searchWith(String searchSection, String valueToSearch){
        waitForDuration(5000);
        selectNonStaticDropDown(searchForDropDown, dropDownContainer,"Search For Dropdown",searchSection);
        waitForDuration(2000);
        if(searchSection.equalsIgnoreCase("Policy number")){
            sendKeys(policyNumberSearchTextBox,valueToSearch, WaitStrategy.PRESENT,"Search Box");
            sendKeyboardButtons(policyNumberSearchTextBox, Keys.ENTER);
        }
        else if(searchSection.equalsIgnoreCase("E-Mail")){
            sendKeys(emailIdSearchTextBox,valueToSearch, WaitStrategy.PRESENT,"Search Box");
            sendKeyboardButtons(emailIdSearchTextBox, Keys.ENTER);
        }
        waitForDuration(3000);
        return this;
    }

    public String getSearchResultPolicyNumber(){
        return getText(searchResultPolicyNumberValue, WaitStrategy.PRESENT);
    }

    public String getSearchResultEmailId(){
        return getText(searchResultEmailValue, WaitStrategy.PRESENT);
    }
}