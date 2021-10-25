package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		//create IOC container 
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class obj
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		try {
			Employee emp=new Employee(6855,"ramesh","CLERK",45555.0f);
			String msg=service.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		//close container
		ctx.close();

	}//main
}//class
