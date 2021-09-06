package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorTest {

	public static void main(String[] args) {
	     //Hold the name and location of spring bean cfg file
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//FileSystemResource res=new FileSystemResource("G:\\Worskpaces\\Spring\\FS-NTSP613\\IOCProj2-constructorInjection\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		  //ClassPathResource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		ClassPathResource res=new ClassPathResource("applicationContext.xml");
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

	FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
}//class
