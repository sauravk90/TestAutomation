package testScripts;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.TestBase;

public class Home extends TestBase {

    @Test
    public void getHeadlines(){

        HomePage homeObj = new HomePage(driver);
        System.out.println(homeObj.getHeadlines());
        System.out.println("done");

    }
}
