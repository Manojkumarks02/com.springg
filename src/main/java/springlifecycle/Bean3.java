package springlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
		DisposableBean, BeanPostProcessor {
	private String beanName;
	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;

	public Bean3() {
        System.out.println("Bean instantiated");
        }

	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("Bean name set: " + name);
	}

	public void setBeanFactory1(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("Bean factory set: " + beanFactory);

	}

	public void setApplicationContext1(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("Application context set: " + applicationContext);
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post-processing before initialization: " + beanName);
		return bean;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called");
	}

	public void init() {
		System.out.println("Custom init method called");

	}

	public void someBusinessLogic() {
		System.out.println("Bean's business logic executed");

	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post-processing after initialization: " + beanName);
		return bean;

	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean's destroy method called");

	}

	public void customDestroyMethod() {
		System.out.println("Custom destroy method called");

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	
		
	}
}
