package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import reports.ExtentLogger;

public class BasePage {

    protected void sendKeys(By by, String valueToEnter, WaitStrategy waitStrategy, String elementName){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy).sendKeys(valueToEnter);
        ExtentLogger.pass(valueToEnter+" is entered in the "+elementName);
    }

    protected void click(By by, WaitStrategy waitStrategy, String elementName){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy).click();
        ExtentLogger.pass(elementName+" is clicked");
    }

    protected String getText(By by, WaitStrategy waitStrategy){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy);
        return DriverManager.getDriver().findElement(by).getText();
    }
}
