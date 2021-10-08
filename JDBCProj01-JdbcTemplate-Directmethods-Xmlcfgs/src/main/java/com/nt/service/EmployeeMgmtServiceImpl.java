package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.IEmployeeDAO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	private  IEmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
	   this.dao=dao;
	}
	
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
	

}
