package driver;

public class DriverManagerFactory {
    public static DriverManager getManager(String browser){
        DriverManager driverManager = null;
        if(browser.equalsIgnoreCase("chrome"))
        {
            driverManager = new ChromeDriverManager();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driverManager = new FirefoxDriverManager();
        }
        return driverManager;
    }
}
