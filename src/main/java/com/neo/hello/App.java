package com.neo.hello;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App {
	public static void main(String[] args) throws Exception {

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(App.class);
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/neo/hello/bean.xml");
		Person person = (Person) context.getBean("person");
		// Person person = context.getBean(Person.class);
		// XmlBeanFactory factory = new XmlBeanFactory(res);

		person.greet();
	}
}