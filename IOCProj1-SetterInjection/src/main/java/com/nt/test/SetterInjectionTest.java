package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	     //Hold the name and location of spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create IOC container (BeanFactory)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get target spring bena class obj from IOC container
		 Object obj=factory.getBean("wmg");
		 //type casting
		 WishMessageGenerator generator=(WishMessageGenerator)obj;
		 //invoke the b.method\
		 String result=generator.generate("raja");
		 System.out.println("Result::"+result);
	}//main
}//class
