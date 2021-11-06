package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AspectjAOPAroundAdviceTest {

	public static void main(String[] args) {
	  //create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class object
		BankService proxy=ctx.getBean("bankService",BankService.class);
		//invoke b.methods
		System.out.println("Simple Intrest amount::"+proxy.calcSimpleIntrestAmount(1000000, 2,12));
		System.out.println("----------------");
		System.out.println("Compound Intrest amount::"+proxy.calcCompoundIntrestAmount(100000, 2,12));
		
		//close the container
		ctx.close();

	}

}
