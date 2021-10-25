package com.nt.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class MappingSQLOperationsAsSubClassesTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get service class obj
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		try {
			System.out.println("Employee name of  7499 ::"+service.fetchEmpNameByNo(7499));
			System.out.println("Employee name of  7900 ::"+service.fetchEmpNameByNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("=================================");
		try {
			System.out.println("CLERK,MANAGER,SALESMAN Employee details are ::");
			List<Employee> list=service.fetchEmpsByDesgs("CLERK", "MANAGER","SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("===============================");
		try {
			System.out.println(service.hikeEmployeeSalaryByDesg(1000.0f,"CLERK"));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		//close  container
		ctx.close();

	}//main
}//class
