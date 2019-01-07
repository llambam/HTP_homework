package lesson16LoggerNotHW;

import org.apache.log4j.Logger;

public class MyFirstLogger {

    private static final Logger logger = Logger.getLogger(MyFirstLogger.class);

    //    private static final Logger logger = Logger.getLogger(Tasks.class);
    public static void main(String[] args) {
        logger.info("sad");
        logger.error("dsfsfd");


    }
}
