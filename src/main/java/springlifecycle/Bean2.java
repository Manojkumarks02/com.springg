package springlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");

	}

	public void destroy() throws Exception {
		System.out.println("Container has been closed " + "and I'm the destroy() method");

	}

}
