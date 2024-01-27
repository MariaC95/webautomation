package utils.drivers;

public abstract class WebDriverProvider {

    protected static ChromeWebDriver chromeWebDriver;
    protected static FirefoxWebDriver firefoxWebDriver;

    public WebDriverProvider(ChromeWebDriver chromeWebDriver, FirefoxWebDriver firefoxWebDriver) {
        this.chromeWebDriver = chromeWebDriver;
        this.firefoxWebDriver = firefoxWebDriver;
    }

    public static void selectWebBrowserDriver(){
        System.out.println("made it to WebDriverProviderDriver class");
        switch(System.getProperty("browser")){
            case "chrome" :
                System.out.println("got to chrome variation");
                ChromeWebDriver.buildChromeDriver();
                break;
            case "firefox" :
                System.out.println("got to firefox variation");
                FirefoxWebDriver.buildFirefoxDriver();
                break;
            default:
                throw new RuntimeException("browser was not set in junit run configurations");
        }
    }

    public static void teardownWebBrowserDriver(){
        switch (System.getProperty("browser")){
            case "chrome" :
                ChromeWebDriver.teardownChromeDriver();
                break;
            case "firefox" :
                FirefoxWebDriver.teardownFirefoxDriver();
                break;
            default:
                throw new RuntimeException("browser teardown unsuccessful");
        }
    }

}
