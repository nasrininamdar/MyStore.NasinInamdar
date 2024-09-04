package Demo;

import org.apache.logging.log4j.*;

public class LoggerDemo {
	

	public static void main(String[] args) {

		Logger log = LogManager.getLogger("LoggerDemo");

		System.out.println(" this is logger demo ");

		log.info("for info only");
		log.fatal("fetal message");

		log.debug("for debug");

		log.error("for error message");

		log.warn("warning message");

	}
	
	

}
