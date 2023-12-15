import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import reports.ExtentReport;

import java.io.IOException;

public class BaseTest {
    protected BaseTest(){}

    @BeforeMethod
    public void startup() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}
