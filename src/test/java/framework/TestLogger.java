package framework;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
public class TestLogger {
    private static Logger log;
    public static void init(){
        log = Logger.getLogger(TestLogger.class);
    }

    public static Logger getLog() {
        init();
        return log;
    }
}
