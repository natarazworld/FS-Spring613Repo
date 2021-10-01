package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	public  void bowling() {
		System.out.println("Crickter is bolwling");
	}
	
	public void fielding() {
		System.out.println("Crickter is fielding");
	}
	
	public void wicketKeeping() {
		System.out.println("Crickter is keeping wickets");
	}
	
	public void batting() {
		System.out.println("Cricketer is battting");
		//create IOC container
		 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Dependent class obj through lookup
		 Bat bat=ctx.getBean("bat",Bat.class);
		 //invoke the method
		 System.out.println(" Cricker score is "+bat.scoreRuns());
		 ctx.close();
	}
	

}
