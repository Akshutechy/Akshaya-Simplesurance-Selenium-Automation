import driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public final class createSingleInsurance extends BaseTest {
    @Test
    public void createSingleInsurancePolicy() {
        DriverManager.getDriver().findElement(By.id("login_username")).sendKeys("testsellingpartner4@simplesurance.de");
        DriverManager.getDriver().findElement(By.id("login_password")).sendKeys("TestSellingPartner4Pass");
        DriverManager.getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
