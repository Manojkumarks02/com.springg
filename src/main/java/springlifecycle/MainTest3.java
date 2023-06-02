package springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest3 {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("life3.xml");
        Bean3 bean = applicationContext.getBean(Bean3.class);
        bean.someBusinessLogic();
        
       ((AbstractApplicationContext) applicationContext).close();

	}

}
