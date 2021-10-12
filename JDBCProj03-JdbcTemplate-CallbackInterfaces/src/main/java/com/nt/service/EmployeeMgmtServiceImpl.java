package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeDAO dao;
	
	@Override
	public Employee fetchEmployeeById(int eno) {
		//use dao
		Employee emp=dao.getEmpDetailsById(eno);
		return emp;
	}

	@Override
	public List<Employee> fetchEmployeesByDegs(String desg1, String desg2, String desg3) {
		return dao.getEmpDetailsByDesgs(desg1, desg2, desg3);
	}
	
}
