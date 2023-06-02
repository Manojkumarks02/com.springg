	package springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("life1.xml");
		Bean1 object = (Bean1) applicationContext.getBean("sai");
		object.getMessage();
//		object.init();
		object.destroy();
	}

}
