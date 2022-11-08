package com.anudipspring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import com.anudipspring.entity.Student;

//@SuppressWarnings("deprecation")
public class App {
	public static void main(String[] args) {
//		Resource res = new ClassPathResource("applicationContext.xml");
//		BeanFactory bea = new XmlBeanFactory(res);
//
//		Student s = (Student) bea.getBean("stud");
//		s.show();
//		Student s1 = (Student) bea.getBean("stud1");
//		s1.show();

		
		
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s2 = (Student) c.getBean("stud");
		s2.show();

		Student s3 = (Student) c.getBean("stud1");
		s3.show();
	}
}