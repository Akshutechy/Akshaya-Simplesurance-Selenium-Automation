import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsuranceSuccessPage;
import pages.LoginPage;

public final class createSingleInsuranceTest extends BaseTest {
    @Test
    public void createSingleInsurancePolicy() throws InterruptedException {
        LoginPage lp = new LoginPage();
        InsuranceSuccessPage isp = lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton()
                .clickNewButton()
                .enterNewInsuranceProductDetails()
                .clickNextButton()
                .enterNewInsuranceCustomerDetails()
                .clickNextButton()
                .confirmAllCheckboxes()
                .clickCreateInsuranceButton()
                .clickContinueToPaymentButton()
                .enterCardDetails("4242424242424242", "1024", "567")
                .clickOrderButton();
        Assert.assertEquals(isp.getInsuranceHeaderText(),"Insurance details");
        Assert.assertEquals(isp.getStatusText(),"Created");
    }
}
