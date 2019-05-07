package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j03 {
	static Logger logger = Logger.getLogger(TestLog4j03.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("e:\\project\\log4j\\src\\log4j.xml");
		
		for (int i = 0; i < 5000; i++) {
			logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
		}
		
	}
}
