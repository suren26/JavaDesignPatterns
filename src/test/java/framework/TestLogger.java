package framework;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestLogger {
    private static Logger log = null;
    public static void init() throws IOException {
        if(log == null) {
            Properties props = new Properties();
            props.load(new FileInputStream("log.out"));
            props.setProperty("log4j.appender.File.File","log.out");
            String log4jConfPath = "log4j.properties";
            PropertyConfigurator.configure(log4jConfPath);
            log = Logger.getLogger(TestLogger.class.getName());
        }
    }

    public static Logger getLog() throws IOException {
        init();
        return log;
    }

}
