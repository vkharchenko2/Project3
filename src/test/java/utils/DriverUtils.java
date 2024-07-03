package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

    private static ChromeDriver driver;

    public static ChromeDriver getDriver() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
