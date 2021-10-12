package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeDAO dao;
	
	
	@Override
	public int fetchEmpsCount() {
	    int count=dao.getEmpsCount();
	    return count;
	}

	@Override
	public String fetchEmpNameByEmpNo(int eno) {
	     //use dao
		String name=dao.getEmpNameByEmpNo(eno);
		return name;
	}
	
	@Override
	public Map<String, Object> fetchEmpDetailsByEmpNo(int eno) {
		Map<String,Object> map=dao.getEmpDetailsByEmpNo(eno);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> fetchEmpDetailsByDesgs(String desg1, String desg2, String desg3) {
	    //use service
		List<Map<String,Object>> empsList=dao.getEmpDetailsByDesgs(desg1, desg2, desg3);
		return empsList;
	}
	
	@Override
	public String fireEmpsOfOnBench() {
	  //use dao
		int count=dao.deleteEmpsNotHavingDeptNo();
		return count+" emps are fired becoz they do not have desg";
	}

	@Override
	public String depositeSalaryWithBonusByDesgs(float bonusAmount, String desg1, String desg2) {
		   int count=dao.addBonusToEmployeesByDesgs(desg1, desg2, bonusAmount);
		return  count+" no.of  employees are benifited with Bonus";
	}
	
	@Override
	public String registerEmployee(String ename, String job, float sal) {
		
		//use dao
		int count=dao.insertEmployee(ename, job, sal);
		return count==1? "Employee registered":"Employee not registered";
	}
	

}
