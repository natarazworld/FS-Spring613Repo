//AutowiredTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class AutowiredTest {

	public static void main(String[] args) {
		//Create IOC container (AC)
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get taget class object
		/*	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
			WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
			System.out.println(generator.hashCode()+"    "+generator1.hashCode());
			 //invoke the b.method\
					 String result=generator.generate("raja");
					 System.out.println("Result::"+result);*/
	}//main
}//class
