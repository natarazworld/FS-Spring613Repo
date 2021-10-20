package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public String fetchEmpNameById(int id) {
		//use dao
		return empDAO.getEmpNameByNo(id);
	}

	@Override
	public List<Employee> fetchEmpsByDesgs(String desg1, String desg2, String desg3) {
		//use dAO
		return empDAO.getEmpDetailsByDesgs(desg1, desg2, desg3);
	}
	
	@Override
	public String registerEmployee(Employee emp) {
	  //use DAO
		int count=empDAO.insertEmployee(emp);
		return count==0?"Employee not registered":"Employee registered";
	}

}
