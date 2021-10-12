package com.nt.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class CallbackInterfacesTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Service class object
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke the methods
		try {
			Employee emp=service.fetchEmployeeById(7499);
			System.out.println(emp);
		
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			System.out.println("Record not found or Problem in retrieving the record");
		}
		System.out.println("======================");
		try {
			List<Employee> listEmps=service.fetchEmployeesByDegs("CLERK", "MANAGER","SALESMAN");
			/*listEmps.forEach(emp->{
				System.out.println(emp);
			}); (or)*/
			//listEmps.forEach(emp->System.out.println(emp)); (or)
			listEmps.forEach(System.out::println);
		}//try
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
     //close container
		ctx.close();
	}//main
}//class
