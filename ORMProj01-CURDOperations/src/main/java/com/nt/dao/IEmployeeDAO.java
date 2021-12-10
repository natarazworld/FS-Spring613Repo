package com.nt.dao;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public   Integer  insert(Employee emp);
	public   Employee getEmployeeByEno(Integer eno);
	public   void   updateEmployee(Employee emp);
	public void  deleteEmployee(Employee emp);

}