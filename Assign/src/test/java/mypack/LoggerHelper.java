package mypack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	static boolean rootFlag=false;
	
	public static Logger getLogger(Class cls) {
		if (rootFlag) {
			return Logger.getLogger(cls);
		}
		else {
			
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/properties/log4j.properties");
		rootFlag=true;
		return Logger.getLogger(cls);
		}
	}

	
	public static void main(String[] args) {
		Logger log =LoggerHelper.getLogger(LoggerHelper.class);
		log.info("Logger is configured");
		log.info("Logger is configured");
		log.info("Logger is configured");
		log.info("Logger is configured");
	}
}
