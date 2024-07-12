package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

public class AlertsPage {

    private WebElement btnJSAlert = DriverUtils.getDriver().findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
    private WebElement btnJSConfirm = DriverUtils.getDriver().findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
    private WebElement btnJSPrompt = DriverUtils.getDriver().findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
    private WebElement result = DriverUtils.getDriver().findElement(By.xpath("//p[@id=\"result\"]"));

    public void clickOnJsAlert(){
        btnJSAlert.click();
        new WebDriverWait(DriverUtils.getDriver(),10).until(ExpectedConditions.alertIsPresent());
        Alert jsAlert = DriverUtils.getDriver().switchTo().alert();
        jsAlert.getText();
        jsAlert.accept();
    }

    public void clickOnJsConfirm(){
        btnJSConfirm.click();
        new WebDriverWait(DriverUtils.getDriver(),10).until(ExpectedConditions.alertIsPresent());
        Alert jsConfirm = DriverUtils.getDriver().switchTo().alert();
        jsConfirm.getText();
        jsConfirm.dismiss();
    }

    public void clickOnJsPrompt(){
        btnJSPrompt.click();
        new WebDriverWait(DriverUtils.getDriver(),10).until(ExpectedConditions.alertIsPresent());
        Alert jsPrompt = DriverUtils.getDriver().switchTo().alert();
        jsPrompt.sendKeys("Hello");
        jsPrompt.accept();
    }

    public String getResult(){
        return result.getText();
    }

}
