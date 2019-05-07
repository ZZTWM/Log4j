package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4j01 {
	//1. ����������ƻ�ȡ��־����
	static Logger logger = Logger.getLogger(TestLog4j01.class);
	
	public static void main(String[] args) throws InterruptedException {
		//2. ����Ĭ������
		BasicConfigurator.configure();
		//3. ������־�������
		logger.setLevel(Level.DEBUG);
		
		//4. ���в�ͬ�������־���
		logger.trace("������Ϣ");
		logger.debug("������Ϣ");
		logger.info("�����Ϣ");
		Thread.sleep(1000);//��Ϊ�˱��ڹ۲�ǰ����־�����ʱ���
		logger.warn("������Ϣ");
		logger.error("������Ϣ");
		logger.fatal("������Ϣ");
	}
}
