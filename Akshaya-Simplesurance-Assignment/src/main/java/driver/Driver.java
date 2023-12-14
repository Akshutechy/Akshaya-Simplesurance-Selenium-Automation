package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadPropertyFile;

import javax.swing.*;
import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver() throws Exception {
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
