package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeWebDriver {

    protected static final WebDriver driver = new ChromeDriver(chromeOptions());

    public static void buildChromeDriver(){
        System.out.println("made it to buildChromeDriver method");
        driver.get("https://automationexercise.com");
        if (driver.getCurrentUrl().contains("getadblock")) {
            driver.close();
        }
    }

    public static void teardownChromeDriver(){
        driver.quit();
    }

    private static ChromeOptions chromeOptions(){
        System.out.println("made it to Chrome options");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addExtensions(new File("C:\\Users\\mariaconnolly95\\webdriversetup\\Unconfirmed 345799.crdownload"));
        return options;
    }
}
