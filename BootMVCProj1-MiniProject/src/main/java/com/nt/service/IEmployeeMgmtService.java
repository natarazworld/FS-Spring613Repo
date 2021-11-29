package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	
	public  List<Employee>  fetchAllEmployees();
	public   String   registerEmployee(Employee emp);
	public   Employee  fetchEmployeeById(int eno);
	public   String   modifyEmployee(Employee emp);
	public  String  removeEmployeeById(int eno);

}
