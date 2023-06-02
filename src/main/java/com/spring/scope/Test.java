package com.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring3.xml");
		Employee employeeObj1 =(Employee) applicationContext.getBean("salaryBean");
		employeeObj1.setSalary("object1 is setting name of the propertity" );
		employeeObj1.test();
		
		Employee employeeObj2 =(Employee) applicationContext.getBean("salaryBean");
		employeeObj2.test();
		
		}

}
