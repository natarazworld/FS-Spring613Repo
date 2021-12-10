package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get taget spring bean class obj
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.methods
		String msg=generator.generateWishMessage("raja");
		System.out.println("Result is ::::"+msg);
		System.out.println("===================");
		LocalDateTime ldt=ctx.getBean("createLDT",LocalDateTime.class);
		System.out.println(ldt);
		
		//close container
		ctx.close();

	}//main
}//class
