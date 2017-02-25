package config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static WebDriver driver;

    public static void Initialize(String driverType)
    {
        switch (DriverType.valueOf(driverType))
        {
            case Chrome:
                InitializeChrome();
                break;

            case Firefox:
                InitializeFireFox();
                break;

            case InternetExplorer:
                InitializeIE();
                break;

            default:
                InitializeChrome();
                break;
        }
    }

    private static void InitializeChrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saurav.kumar\\Desktop\\Site\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("chrome.switches", "--disable-extensions");
        driver = new ChromeDriver(options);
    }

    private static void InitializeFireFox()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\saurav.kumar\\Desktop\\Site\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    private static void InitializeIE()
    {
        System.setProperty("webdriver.ie.driver","C:\\Users\\saurav.kumar\\Desktop\\Site\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public enum DriverType
    {
        InternetExplorer,
        Chrome,
        Firefox
    }

    public static String GetDocumentReadyState() {
        return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

}
