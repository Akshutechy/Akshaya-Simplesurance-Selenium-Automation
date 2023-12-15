import com.google.common.collect.Ordering;
import enums.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsuranceSuccessPage;
import pages.LoginPage;
import utils.ReadPropertyFile;

import java.util.List;

public final class sortInsuranceTest extends BaseTest {
    @Test
    public void sortInsuranceWithPolicyNumber(){
        LoginPage lp = new LoginPage();
        List<String> listInResponse = lp.loginAndRoutToHomePage(ReadPropertyFile.getValue(ConfigProperties.EMAILID),ReadPropertyFile.getValue(ConfigProperties.PASSWORD))
                .clickPolicyNumberAccordion()
                .getTextAllPolicyNumber();
        Assert.assertTrue(Ordering.natural().isOrdered(listInResponse));
    }

    @Test
    public void sortInsuranceWithActivationDate() {
        LoginPage lp = new LoginPage();
        List<String> listInResponse = lp.loginAndRoutToHomePage(ReadPropertyFile.getValue(ConfigProperties.EMAILID),ReadPropertyFile.getValue(ConfigProperties.PASSWORD))
                .clickActivationDateAccordion()
                .clickActivationDateAccordion()
                .getTextAllActivationDate();
        Assert.assertTrue(Ordering.natural().isOrdered(listInResponse));
    }
}