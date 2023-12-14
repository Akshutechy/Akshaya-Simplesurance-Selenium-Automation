package pages;

import constants.FrameworkConstants;
import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void sendKeys(By by, String valueToEnter, WaitStrategy waitStrategy){
        if(waitStrategy==WaitStrategy.CLICKABLE){
            waitForElementToBeClickable(by);
        }
        else if(waitStrategy==WaitStrategy.PRESENT){
            waitForElementToBePresent(by);
        }
        DriverManager.getDriver().findElement(by).sendKeys(valueToEnter);
    }

    protected void click(By by, WaitStrategy waitStrategy){
        if(waitStrategy==WaitStrategy.CLICKABLE){
            waitForElementToBeClickable(by);
        }
        else if(waitStrategy==WaitStrategy.PRESENT){
            waitForElementToBePresent(by);
        }
        DriverManager.getDriver().findElement(by).click();
    }

    protected void getText(By by, WaitStrategy waitStrategy){
        if(waitStrategy==WaitStrategy.CLICKABLE){
            waitForElementToBeClickable(by);
        }
        else if(waitStrategy==WaitStrategy.PRESENT){
            waitForElementToBePresent(by);
        }
        DriverManager.getDriver().findElement(by).getText();
    }

    private void waitForElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getTimeout()));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private void waitForElementToBePresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getTimeout()));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
