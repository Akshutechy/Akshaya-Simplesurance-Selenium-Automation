import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected BaseTest(){}

    @BeforeTest
    public void startup(){
        Driver.initDriver();
    }

    @AfterTest
    public void tearDown(){
        Driver.quitDriver();
    }
}
