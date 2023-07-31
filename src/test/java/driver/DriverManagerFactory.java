package driver;

public class DriverManagerFactory {
    static DriverManager driverManager = null;
    public static DriverManager getManager(String browser){

            if (browser.equalsIgnoreCase("chrome")) {
                driverManager = new ChromeDriverManager();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driverManager = new FirefoxDriverManager();
            }

        return driverManager;
    }

}
