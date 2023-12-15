package driver;

import enums.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ReadPropertyFile;

import javax.swing.*;
import java.util.Objects;

public final class Driver {
    private Driver(){}

    private static WebDriver driver;
    public static void initDriver() throws Exception {
        if(Objects.isNull(DriverManager.getDriver())) {
            if(ReadPropertyFile.getValue(ConfigProperties.BROWSER).equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if(ReadPropertyFile.getValue(ConfigProperties.BROWSER).equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(ReadPropertyFile.getValue(ConfigProperties.URL));
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
