package test;
import driver.DriverManager;
import driver.DriverManagerFactory;
import framework.TestLogger;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.Loginpage;

public class LoginpageTest {

    WebDriver driver;
    DriverManager driverManager;
    Loginpage lp;
    Logger logger;
    @BeforeMethod
    public void setUp() {
        logger=TestLogger.getLog();
        logger.info("---Set up HomePageTest---");
        driverManager=DriverManagerFactory.getManager("CHROME");
        driver=driverManager.getDriver();
        lp=new Loginpage(driver);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        logger.info("---Login Test---");
        lp.using(driver).login();
    }

    @AfterMethod
    public void tearDown() {
        logger.info("---Tear Down HomePageTest---");
        try {
            driver.quit();
        }
        catch (Exception e)
        {
            System.out.println("Driver Closed : "+e);
        }
    }
}
