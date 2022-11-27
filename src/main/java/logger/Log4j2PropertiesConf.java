package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * contains all the methods to show the logs on console
 * and save the logs in propertieslogs file of each run.

 */

public class Log4j2PropertiesConf {

    private static final Logger logger = LogManager.getLogger(Log4j2PropertiesConf.class);

    public static void main (String[] args) {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

    }
}
