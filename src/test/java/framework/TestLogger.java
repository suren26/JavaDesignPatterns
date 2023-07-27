package framework;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
public class TestLogger {
    private static Logger log = null;
    public static void init(){
        if(log == null) {
            log = Logger.getLogger(TestLogger.class);
        }
    }

    public static Logger getLog() {
        init();
        return log;
    }
}
