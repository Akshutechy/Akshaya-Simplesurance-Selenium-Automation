import driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import reports.ExtentReport;

public final class createSingleInsurance extends BaseTest {
    @Test
    public void createSingleInsurancePolicy() {
        LoginPage lp = new LoginPage();
        lp.enterEmailId("testsellingpartner4@simplesurance.de")
                .enterPassword("TestSellingPartner4Pass")
                .clickNextButton();
    }
}
