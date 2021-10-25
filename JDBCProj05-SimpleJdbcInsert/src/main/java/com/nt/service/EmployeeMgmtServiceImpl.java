package com.nt.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public String registerEmployee(Employee emp) {
	 //use DAO
		int count=empDAO.insert(emp);
		return count==0?"employee not registered":"employee registered";
		}

}
