package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	    //create ApplicationContext container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("container created (AC)");
		//get target spring bena class obj from IOC container
			WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
			WishMessageGenerator generator2=ctx.getBean("wmg",WishMessageGenerator.class);
			System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
			System.out.println("generator1==generator?"+(generator1==generator2));
		
		
	}//main
}//class
