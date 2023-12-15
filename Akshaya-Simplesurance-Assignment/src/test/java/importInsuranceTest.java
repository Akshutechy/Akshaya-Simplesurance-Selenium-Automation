import com.google.common.collect.Ordering;
import constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.List;

public final class importInsuranceTest extends BaseTest {

    String expectedImportErrorMessageText = "Error at errors message: Can&#39;t solve the partner assignment for the payment schema id 0525f28d02af49ca91286bd2cef8772b";

    @Test
    public void importCsvFileViaUpload(){
        LoginPage lp = new LoginPage();
        String importErrorMessageText = lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton()
                .clickImportButton()
                .uploadCsvFile(FrameworkConstants.getUploadCsvFilePath())
                .clickCreateInsuranceButton()
                .getImportErrorMessageText();
        Assert.assertEquals(importErrorMessageText, expectedImportErrorMessageText);
    }

    @Test
    public void importCsvFileViaImportButton(){
        LoginPage lp = new LoginPage();
        String importErrorMessageText = lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton()
                .clickImportButton()
                .importCsvFile(FrameworkConstants.getUploadCsvFilePath())
                .clickCreateInsuranceButton()
                .getImportErrorMessageText();
        Assert.assertEquals(importErrorMessageText, expectedImportErrorMessageText);
    }
}