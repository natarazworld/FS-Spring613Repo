package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.IEmployeeMgmtService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get  Service class obj
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke the method
		try {
			String result=service.login("raja", "rani1");
			System.out.println(result);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		//close container
		ctx.close();

	}

}
