package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IPurchaseOrder;

@SpringBootApplication
public class SpringMailProj1Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SpringMailProj1Application.class, args);
		//get service class object
		IPurchaseOrder order=ctx.getBean("purchaseService",IPurchaseOrder.class);
		//invoke metthods
		try {
			String msg=order.purchase(new String[] {"XMAS-Tree","Star","Clothes"}, 
					                                    new double[]{6000.0,3000.0,20000.0},
					                                     new String[] {"nataraz@gmail.com","rkkatikireddy@gmail.com",
					                                    		 "justshare35@gmail.com","rajanmishra450@gmail.com"}		                                                  
					                                     );
			System.out.println(msg);
			
		}//try
	 catch(Exception e) {
		 e.printStackTrace();
	 }
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
