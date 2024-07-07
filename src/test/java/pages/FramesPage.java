package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class FramesPage {

    private WebElement btnNestedFrames = DriverUtils.getDriver().findElement(By.xpath("//a[@href=\"/nested_frames\"]"));

    public void clickOnNestedFrameBtn() {
        btnNestedFrames.click();
    }
}
