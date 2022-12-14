package utils;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver firefoxBrowsing() {
        System.setProperty("webdriver.gecko.driver", "path do driver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }


    public static WebDriver chromeBrowsing() {
        System.setProperty("webdriver.chrome.driver", "path do driver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
