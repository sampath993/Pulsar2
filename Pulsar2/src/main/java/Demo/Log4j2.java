package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

	 private static Logger logger = LogManager.getLogger(Log4j2.class);
	 
	public static void main(String[] args) {
		
	System.out.println("\n Hellow World...!  \n");
		
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an Fatal message");
		
		System.out.println("\n Completed ");
	

	}

}
