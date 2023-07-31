package test;

import driver.DriverManager;
import driver.DriverManagerFactory;
import framework.TestLogger;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Loginpage;
import pages.Productpage;

public class SwaglabsTest {
    WebDriver driver;
    DriverManager driverManager;
    Productpage productpage;
    Logger logger;
    Loginpage lp;
    Productpage pp;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        logger=TestLogger.getLog();
        logger.info("---Set up SwagsLabtest---");
        driverManager=DriverManagerFactory.getManager("CHROME");
        driver=driverManager.getDriver();
        lp=new Loginpage(driver);
        lp.login();
        pp=new Productpage(driver);
    }

    @Test
    public void cartTest() {
        if(pp.swaglabs()){
            logger.info("Swag Labs visible");
            pp.using(driver)
                    .addToCart()
                    .checkAddToCart();
        }
        else {
            logger.info("Swag Labs not visible");
        }

    }

    @AfterMethod
    public void tearDown() {
        //lp.logout();
        try {
            driver.quit();
        }
        catch (Exception e)
        {
            System.out.println("Driver Closed : "+e);
        }
    }
}
