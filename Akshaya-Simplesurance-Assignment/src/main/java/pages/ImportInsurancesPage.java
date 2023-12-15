package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class ImportInsurancesPage extends BasePage {

    private final By dropFileHereButton = By.xpath("//div[@role=\"presentation\"]//input[@type='file']");
    private final By importFileButton = By.cssSelector("input#input-csv");
    private final By createInsuranceButton = By.cssSelector("div.MuiGrid-item button");
    private final By importErrorMessageText = By.cssSelector("span#client-snackbar ul li");

    public ImportInsurancesPage uploadCsvFile(String csvFilePath) {
        uploadFiles(dropFileHereButton, csvFilePath, WaitStrategy.PRESENT);
        return this;
    }

    public ImportInsurancesPage importCsvFile(String csvFilePath) {
        uploadFiles(importFileButton, csvFilePath, WaitStrategy.PRESENT);
        return this;
    }

    public ImportInsurancesPage clickCreateInsuranceButton(){
        click(createInsuranceButton, WaitStrategy.CLICKABLE, "Create Insurance Button");
        return this;
    }

    public String getImportErrorMessageText(){
        return getText(importErrorMessageText,WaitStrategy.VISIBLE);
    }

}