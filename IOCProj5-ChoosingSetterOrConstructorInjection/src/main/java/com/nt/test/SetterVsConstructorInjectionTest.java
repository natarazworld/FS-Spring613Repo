package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Student;

public class SetterVsConstructorInjectionTest {

	public static void main(String[] args) {
		//create BeanFactory IOC container
		 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //get Spring bean class object
		 Student st=factory.getBean("st",Student.class);
		 System.out.println(st);
		 
	}

}
