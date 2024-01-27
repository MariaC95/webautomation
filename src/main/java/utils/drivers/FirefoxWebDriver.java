package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class FirefoxWebDriver {

    protected static final WebDriver driver = new FirefoxDriver(new FirefoxOptions());

    public static void buildFirefoxDriver(){
        System.out.println("made it to buildFirefoxDriver method");
        driver.get("https://automationexercise.com");
    }

    public static void teardownFirefoxDriver(){
        driver.quit();
    }

    private static FirefoxOptions firefoxOptions(){
        System.out.println("made it to Firefox options");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        return options;
    }

}
