package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

public final class HomePage {

    private final By newButton = By.xpath("//span[contains(text(),'New')]");

    public void clickNewButton(){
        DriverManager.getDriver().findElement(newButton).click();
    }

}
