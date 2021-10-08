package com.nt.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring Bean class obj (service class obj)
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		try {
			System.out.println("Employess count::"+service.fetchEmpsCount());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println(".....................................");
		try {
			System.out.println("Employee name for given EmpNo::"+service.fetchEmpNameByEmpNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		System.out.println(".....................................");
		try {
			System.out.println("Employee Details of 7499 eno are::"+service.fetchEmpDetailsByEmpNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		System.out.println("............................................");
		try {
			System.out.println("MANAGER,CLERK,ANALYST DESGS Emp details are ");
			List<Map<String,Object>> empsList=service.fetchEmpDetailsByDesgs("CLERK","MANAGER","ANALYST");
			empsList.forEach(map->{
				System.out.println(map);
			});
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		System.out.println("................................");
		try {
			System.out.println(service.fireEmpsOfOnBench());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
     //close container
		ctx.close();
	}

}
