package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EcommerceStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class object
		EcommerceStore proxy=ctx.getBean("ecommerceService",EcommerceStore.class);
		System.out.println(proxy.getClass()+"  "+proxy.getClass().getSuperclass());
		System.out.println(Arrays.toString(proxy.getClass().getDeclaredMethods()));
		//invoke b.methods
		try {
			double billAmt=proxy.shopping(new String[] {"shirt", "trouser"},
					                                             new double[] {5000,10000});
			System.out.println("Bill Amount is ::"+billAmt);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		ctx.close();
		

	}

}
