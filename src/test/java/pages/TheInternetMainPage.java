package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class TheInternetMainPage {

    private WebElement btnMultipleWindows = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/windows\"]"));
    private WebElement btnFrames = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/frames\"]"));
    private WebElement btnJSAlerts = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/javascript_alerts\"]"));

    public void clickOnMultipleWindowsBtn() {
        btnMultipleWindows.click();
    }

    public void clickOnFramesBtn(){
        btnFrames.click();
    }

    public void clickOnJSAlerts(){
        btnJSAlerts.click();
    }
}

