package test;
import driver.DriverManager;
import driver.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Loginpage;

public class LoginpageTest {

    WebDriver driver;
    DriverManager driverManager;
    Loginpage lp;

    @BeforeMethod
    public void setUp() {
        System.out.println("---Set up HomePageTest---");
        driverManager=DriverManagerFactory.getManager("CHROME");
        driver=driverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        lp=new Loginpage(driver);
    }

    @Test
    public void LoginTest() {
        lp.login(driver);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("---Tear Down HomePageTest---");
        driver.quit();
    }
}
