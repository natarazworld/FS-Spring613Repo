package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
 private  IEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchAllEmployees() {
	    //use dao
		List<Employee> listEmps=dao.getAllEmployees();
		System.out.println(" service :"+listEmps.size());
        
		return  listEmps;
	}
	
	@Override
	public String registerEmployee(Employee emp) {
	    //use dao
		int count=dao.insert(emp);
		return count==0?"Employee is not Registered":"Employee registered";
	}
	
	@Override
	public Employee fetchEmployeeById(int eno) {
		//use  DAO
		Employee emp=dao.getEmployeeByEno(eno);
		System.out.println(emp);
		return emp;
	}
	
	@Override
	public String modifyEmployee(Employee emp) {
		//use DAO
		int count=dao.updateEmployee(emp);
		return count==0?"Employee not updated": "Employee Updated";
	}

	@Override
	public String removeEmployeeById(int eno) {
		//use DAO
		int count=dao.deleteEmployee(eno);
		return count==0?"Employee not Deleted": "Employee Deleted";
	}
	
	

}
