package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest1 {

	public static void main(String[] args) {
		//create BeanFactory IOC container
          DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
          //create XmlBeanDefinitationReader having IOC container
          XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
          //Load spring bean cfg file to read
          reader.loadBeanDefinitions("com/nt/cfgs1/applicationContext.xml");
          
		//get target spring bena class obj from IOC container
		 Object obj=factory.getBean("wmg");
		 //type casting
		 WishMessageGenerator generator=(WishMessageGenerator)obj;
		 //invoke the b.method\
		 String result=generator.generate("raja");
		 System.out.println("Result::"+result);
	}//main

	FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
}//class
