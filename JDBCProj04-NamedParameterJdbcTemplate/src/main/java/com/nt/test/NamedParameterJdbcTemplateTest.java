package com.nt.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get SErvice class obj
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		try {
			System.out.println("emp name::"+service.fetchEmpNameById(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("===========================");
		try {
			System.out.println("Emp details whose desgs are CLERK,MANAGER,SALESMAN");
			List<Employee> listEmps=service.fetchEmpsByDesgs("CLERK","MANAGER","SALESMAN");
			listEmps.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		System.out.println("===========================");
		try {
			Employee emp=new Employee(6774,"ramesh","CLERK",667.88f);
			String msg=service.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		//close container
		ctx.close();
		

	}

}
