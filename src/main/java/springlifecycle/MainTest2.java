package springlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {
	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("life2.xml");
	
	Bean2 object = (Bean2) applicationContext.getBean("sai");
	
	applicationContext.close();	
	}
}
