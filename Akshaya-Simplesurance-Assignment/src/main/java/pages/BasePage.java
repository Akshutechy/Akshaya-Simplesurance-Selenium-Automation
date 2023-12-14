package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;

public class BasePage {

    protected void sendKeys(By by, String valueToEnter, WaitStrategy waitStrategy){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy).sendKeys(valueToEnter);
    }

    protected void click(By by, WaitStrategy waitStrategy){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy).click();
    }

    protected String getText(By by, WaitStrategy waitStrategy){
        ExplicitWaitFactory.performExplicitWait(by,waitStrategy);
        return DriverManager.getDriver().findElement(by).getText();
    }
}
