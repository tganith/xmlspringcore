package com.mylabs.xmlspringcore.example1;


import com.mylabs.xmlspringcore.example1.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextApp {

	// created IOC Container using application context and here used setter Injection
	public static void main(String[] args) {

		// 1. using ClassPathXmlApplicationContext for IOC Container
         ApplicationContext context = new ClassPathXmlApplicationContext("emp_address.xml");
         Employee emp = (Employee)context.getBean("employee");
           emp.display();
		   emp.getAddress().display();

         // 2. using FileSystemXmlApplicationContext for IOC Container
	//	ApplicationContext context1 = new FileSystemXmlApplicationContext("/media/ganitha/Data/JavaProjects/spring projects/SpringCore/springcore/src/main/resources/emp_address.xml");


	}

}
