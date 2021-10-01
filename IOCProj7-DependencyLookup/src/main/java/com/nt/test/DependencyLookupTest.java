package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// getBean
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		cktr.batting();
		cktr.bowling();
		cktr.fielding();
		//close container
		ctx.close();

	}

}
