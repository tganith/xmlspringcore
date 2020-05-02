package com.mylabs.xmlspringcore.example2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class XMLSpringCoreBeanFactoryDemo {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		XMlServiceImpl xMlService = (XMlServiceImpl)beanFactory.getBean("xmlservice");

	}

}
