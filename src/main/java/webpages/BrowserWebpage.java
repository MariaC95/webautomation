package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWebpage {

    public WebDriver driver;
    public BrowserWebpage() {
        this.driver = new ChromeDriver();
    }

    public void openBrowser(){
        System.out.println("made it to page object");
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        System.out.println("chrome launched from PO");
    }
}
