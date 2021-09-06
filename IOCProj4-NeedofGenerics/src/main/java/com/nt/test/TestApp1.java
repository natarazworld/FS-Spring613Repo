package com.nt.test;

import com.nt.comp.Customer;
import com.nt.comp.DataMgmtService;
import com.nt.comp.Employee;

public class TestApp1 {

	public static void main(String[] args) {
		 DataMgmtService service=new DataMgmtService();
		 /*Person per=service.showData("emp");
		 Employee emp=(Employee)per;
		 System.out.println("salary::"+emp.getEmpSalary()); */
		 
	/*	 Employee emp=(Employee)service.showData("emp");
		 System.out.println("salary::"+emp.getEmpSalary());*/
		 
		 Employee emp=service.showData1("emp",Employee.class);
		 System.out.println(emp.getEmpSalary());
		 System.out.println("--------------------------");
		Customer cust=service.showData1("cust",Customer.class);
		 System.out.println(cust.getBillAmt());
		 System.out.println("--------------------------");


	}

}
