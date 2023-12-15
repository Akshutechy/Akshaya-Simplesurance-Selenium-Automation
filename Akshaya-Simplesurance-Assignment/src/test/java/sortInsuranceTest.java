import com.google.common.collect.Ordering;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsuranceSuccessPage;
import pages.LoginPage;

import java.util.List;

public final class sortInsuranceTest extends BaseTest {
    @Test
    public void sortInsuranceWithPolicyNumber(){
        LoginPage lp = new LoginPage();
        List<String> listInResponse = lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton()
                .clickPolicyNumberAccordion()
                .getTextAllPolicyNumber();
        Assert.assertTrue(Ordering.natural().isOrdered(listInResponse));
    }

    @Test
    public void sortInsuranceWithActivationDate() {
        LoginPage lp = new LoginPage();
        List<String> listInResponse = lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton()
                .clickActivationDateAccordion()
                .clickActivationDateAccordion()
                .getTextAllActivationDate();
        Assert.assertTrue(Ordering.natural().isOrdered(listInResponse));
    }
}