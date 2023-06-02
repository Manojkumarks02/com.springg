package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.model.ConstructorInjection;

public class ConstructorTest {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("constructorInjection.xml");
        BeanFactory b = new XmlBeanFactory(rs);
        
        ConstructorInjection constructorInjection = (ConstructorInjection) b.getBean("e");
        constructorInjection.show();
        
        
	}

}
