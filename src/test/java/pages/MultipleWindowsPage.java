package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

import java.util.Set;


public class MultipleWindowsPage {

    private WebElement btnClickHere = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/windows/new\"]"));

    public void clickOnClickHereBtn() {
        btnClickHere.click();
        String mainPage = DriverUtils.getDriver().getWindowHandle();
        Set<String> allPagesOpen = DriverUtils.getDriver().getWindowHandles();
        for (String page : allPagesOpen) {
            if (!page.equals(mainPage)) {
                DriverUtils.getDriver().switchTo().window(page);
                break;
            }
        }
    }
}
