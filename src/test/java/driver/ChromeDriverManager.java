package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ChromeDriverManager extends DriverManager{
    ChromeDriverManager(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    public WebDriver getDriver(){
        return driver;
    }

}
