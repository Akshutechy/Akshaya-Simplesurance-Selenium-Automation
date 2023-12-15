package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class HomePage extends BasePage {

    private final By newButton = By.xpath("//span[contains(text(),'New')]");

    public void clickNewButton(){
        click(newButton, WaitStrategy.CLICKABLE, "New Button");
    }
}