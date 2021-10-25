package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String fetchEmpNameByNo(int no) {
     //use dao
		  return  dao.getEmpNameByNo(no);
	}
	
	@Override
	public List<Employee> fetchEmpsByDesgs(String desg1, String desg2, String desg3) {
		return dao.getEmpsByDesgs(desg1, desg2, desg3);
	}
	
	@Override
	public String hikeEmployeeSalaryByDesg(Float bonus, String desg) {
		//use DAO
		int count=dao.updateEmpSalaryByDesg(bonus, desg);
		return  count+" no.of employees are effected with hiked salary";
	}

}
