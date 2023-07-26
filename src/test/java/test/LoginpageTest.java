package test;
import driver.DriverManager;
import driver.DriverManagerFactory;
import framework.TestLogger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Loginpage;

public class LoginpageTest {

    WebDriver driver;
    DriverManager driverManager;
    Loginpage lp;
    TestLogger logger;
    @BeforeMethod
    public void setUp() {
        logger.log.info("---Set up HomePageTest---");
        driverManager=DriverManagerFactory.getManager("CHROME");
        driver=driverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        lp=new Loginpage(driver);
    }

    @Test
    public void LoginTest() {
        logger.log.info("---Login Test---");
        lp.login(driver);

    }

    @AfterMethod
    public void tearDown() {
        logger.log.info("---Tear Down HomePageTest---");
        driver.quit();
    }
}
