package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class NewWindowPage {

    private WebElement newWindow = DriverUtils.getDriver().findElement(By.xpath("//div[@class=\"example\"]"));

    public String getTextFromThePage() {
        return newWindow.getText();
    }
}
