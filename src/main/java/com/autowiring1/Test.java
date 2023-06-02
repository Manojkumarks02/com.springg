package com.autowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring1");
		
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
	
		
	}

}
