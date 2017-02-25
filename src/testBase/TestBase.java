package testBase;

import config.Driver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utility.Constants;
import java.util.concurrent.TimeUnit;

public class TestBase extends Driver{

    @BeforeSuite
    @Parameters({"browser"})
    public void setUp(String browser){

        Driver.Initialize(browser);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constants.baseUrl);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
        System.out.println("Test Execution was completed.");
    }
}
