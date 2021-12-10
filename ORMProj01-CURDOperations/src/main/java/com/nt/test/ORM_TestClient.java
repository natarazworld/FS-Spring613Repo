package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class ORM_TestClient {
	
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class object
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		// invoke method
		/*	try {
				Employee e=new Employee();
				e.setEname("rakesh"); e.setEadd("hyd"); e.setSalary(90000.0f);
				String result=service.registerEmployee(e);
				System.out.println(result);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*System.out.println("------loading object----------------------");
		try {
			System.out.println("169 employee detials are ::"+service.fetchEmploeeByEno(169));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------updating object --------------");
		try {
				System.out.println(service.modifyEmployeeById(169, 20.0f));
				System.out.println("169 employee details"+service.fetchEmploeeByEno(169));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		System.out.println("------------deleting object ----------------");
		
		try {
			System.out.println(service.deleteEmployeeById(169));
			System.out.println("169 employee details"+service.fetchEmploeeByEno(169));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
