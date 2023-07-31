package driver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected static WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
}
