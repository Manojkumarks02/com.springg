package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.model.CI2;

public class CT2 {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("CI@.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		CI2 c = (CI2) beanFactory.getBean("a");
		c.show();
	}

}
