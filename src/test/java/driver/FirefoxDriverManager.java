package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    FirefoxDriverManager(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }
    public WebDriver getDriver(){
        return driver;
    }

}
