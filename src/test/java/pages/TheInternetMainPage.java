package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class TheInternetMainPage {

    private WebElement btnMultipleWindows = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/windows\"]"));

    public void clickOnMultipleWindowsBtn() {
        btnMultipleWindows.click();
    }
}

