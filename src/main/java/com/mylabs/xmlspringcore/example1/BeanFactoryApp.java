package com.mylabs.xmlspringcore.example1;


import com.mylabs.xmlspringcore.example1.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryApp {


	//this example for creating xml bean factory type of IOC Container
	public static void main(String[] args) {

	    Resource resource = new ClassPathResource("emp_address.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Employee emp = (Employee)factory.getBean("employee");

         System.out.println(emp.getEmpId());
		 System.out.println(emp.getEmpName());
		 emp.getAddress().display();

	}

}
