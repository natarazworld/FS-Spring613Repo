package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest1 {

	public static void main(String[] args) {
	    //create ApplicationContext container
		DefaultListableBeanFactory  factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get target spring bena class obj from IOC container
		//WishMessageGenerator generator1=factory.getBean("wmg",WishMessageGenerator.class);
		/*WishMessageGenerator generator2=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
		System.out.println("generator1==generator?"+(generator1==generator2));*/
		
		
	}//main
}//class
