package utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.drivers.ChromeWebDriver;
import utils.drivers.WebDriverProvider;

import java.io.File;

public class Hooks {

    //ChromeDriver driver;
    protected WebDriverProvider webDriverProvider;

    @Before
    public void setup(){
        WebDriverProvider.selectWebBrowserDriver();
    }

    @After
    public void teardown(){
        WebDriverProvider.teardownWebBrowserDriver();
    }

}
