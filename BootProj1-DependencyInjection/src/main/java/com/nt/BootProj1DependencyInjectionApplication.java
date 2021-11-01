package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj1DependencyInjectionApplication {
	
	@Bean(name="ldt")
	public  LocalDateTime createLDT() {
		 return LocalDateTime.now();
	}

	public static void main(String[] args) {
		 //get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj1DependencyInjectionApplication.class, args);
		//get Target clas object from IOC container
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke b.methods
			String msg=generator.generateWishMessage("raja");
			System.out.println("Result is ::"+msg);
			
			//close container
			((ConfigurableApplicationContext) ctx).close();
		
	}

}
