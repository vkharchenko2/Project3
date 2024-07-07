package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverUtils;

public class MainPageTests {

    public static final String PAGE_URL = "https://the-internet.herokuapp.com/";


    @BeforeMethod
    public void beforeMethod() {
        WebDriver driver = DriverUtils.getDriver();
        driver.get(PAGE_URL);
    }

    @Test
    public void test() {
        TheInternetMainPage theInternetMainPage = new TheInternetMainPage();
        theInternetMainPage.clickOnMultipleWindowsBtn();
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
        multipleWindowsPage.clickOnClickHereBtn();
        NewWindowPage newWindowPage = new NewWindowPage();
        Assert.assertEquals(newWindowPage.getTextFromThePage(), "New Window", "Надписи не одинаковы");
        DriverUtils.quitDriver();
    }

    @Test
    public void testTwo() {
        TheInternetMainPage theInternetMainPage = new TheInternetMainPage();
        theInternetMainPage.clickOnFramesBtn();
        FramesPage framesPage = new FramesPage();
        framesPage.clickOnNestedFrameBtn();
        NestedFramesPage nestedFramesPage = new NestedFramesPage();
        nestedFramesPage.switchToLeftFrame();
    }
}
