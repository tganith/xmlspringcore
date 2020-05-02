package com.mylabs.xmlspringcore.example2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLSpringCoreApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		XMlServiceImpl xMlService = (XMlServiceImpl)applicationContext.getBean("xmlservice");

	}

}
