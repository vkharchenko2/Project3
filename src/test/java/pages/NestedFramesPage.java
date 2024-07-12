package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

public class NestedFramesPage {

    private WebElement frameTop = DriverUtils.getDriver().findElement(By.xpath("//frame[@name=\"frame-top\"]"));
    //private WebElement framesetMiddle = DriverUtils.getDriver().findElement(By.xpath("//frameset[@name=\"frameset-middle\"]"));
    private WebElement frameLeft = DriverUtils.getDriver().findElement(By.xpath("//frame[@name=\"frame-left\"]"));
    private WebElement frameMiddle = DriverUtils.getDriver().findElement(By.xpath("//frame[@src=\"/frame_middle\"]"));
    private WebElement frameRight = DriverUtils.getDriver().findElement(By.xpath("//frame[@src=\"/frame_right\"]"));
    private WebElement frameBottom = DriverUtils.getDriver().findElement(By.xpath("//frame[@src=\"/frame_bottom\"]"));


    public void switchToTopFrame() {
        DriverUtils.getDriver().switchTo().defaultContent().switchTo().frame(frameTop);
    }

    public void switchToLeftFrame() {
        DriverUtils.getDriver().switchTo().defaultContent().switchTo().frame(frameLeft);
    }

    public void switchToMiddleFrame() {
        DriverUtils.getDriver().switchTo().frame(frameMiddle);
    }

    public void switchToRightFrame() {
        DriverUtils.getDriver().switchTo().frame(frameRight);
    }

    public void switchToBottomFrame() {
        DriverUtils.getDriver().switchTo().frame(frameBottom);
    }
}
