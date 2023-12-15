import com.google.common.collect.Ordering;
import enums.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ReadPropertyFile;

import java.util.List;

public final class searchInsuranceTest extends BaseTest {
    String policyNumber = "200000372674";
    String emailId = "test@test.com";

    @Test
    public void searchInsuranceWithPolicyNumber() {
        LoginPage lp = new LoginPage();
        String searchResultPolicyNumber = lp.loginAndRoutToHomePage(ReadPropertyFile.getValue(ConfigProperties.EMAILID),ReadPropertyFile.getValue(ConfigProperties.PASSWORD))
                .searchWith("Policy number", policyNumber)
                .getSearchResultPolicyNumber();
        Assert.assertEquals(searchResultPolicyNumber,policyNumber);
    }

    @Test
    public void searchInsuranceWithEmail() {
        LoginPage lp = new LoginPage();
        String searchResultEmailId = lp.loginAndRoutToHomePage(ReadPropertyFile.getValue(ConfigProperties.EMAILID),ReadPropertyFile.getValue(ConfigProperties.PASSWORD))
                .searchWith("E-Mail", emailId)
                .getSearchResultEmailId();
        Assert.assertEquals(searchResultEmailId,emailId);
    }
}