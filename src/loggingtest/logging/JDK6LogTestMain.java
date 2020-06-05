package logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDK6LogTestMain {
	
    private static final Logger logger = LogManager.getLogger(JDK6LogTestMain.class.getName());
	public static void main(String []argArray) {
		logger.debug("Log4 Debug is working");
		for(String arg : argArray) {
			logger.debug(arg);
		}

	}

}
