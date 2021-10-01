package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		//crreate IOC container container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class obj
		PersonInfo info=ctx.getBean("per",PersonInfo.class);
		System.out.println(info);
		System.out.println("================");
		PersonInfo info1=ctx.getBean("p",PersonInfo.class);
		System.out.println(info1);
		System.out.println("================");
		PersonInfo info2=ctx.getBean("p1",PersonInfo.class);
		System.out.println(info2);
		//close container
		ctx.close();
	}

}
