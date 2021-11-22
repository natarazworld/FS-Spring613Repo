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

}
