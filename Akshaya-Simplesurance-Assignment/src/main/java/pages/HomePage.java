package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import reports.ExtentLogger;
import reports.ExtentManager;
import reports.ExtentReport;

public final class HomePage extends BasePage {

    private final By newButton = By.xpath("//span[contains(text(),'New')]");

    public void clickNewButton(){
        click(newButton, WaitStrategy.CLICKABLE, "New Button");
    }
}