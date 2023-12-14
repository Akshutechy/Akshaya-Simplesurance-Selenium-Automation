package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.Objects;

public class Driver {
    private Driver(){}

    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
