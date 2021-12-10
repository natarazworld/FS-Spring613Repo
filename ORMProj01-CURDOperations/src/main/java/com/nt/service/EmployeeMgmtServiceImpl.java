package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
@Transactional(propagation = Propagation.REQUIRED,transactionManager = "hbTxMgmr")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String registerEmployee(Employee emp) {
		 //use DAO
		return "employee is saved with id "+ dao.insert(emp); 
	}
	
	@Override
	public Employee fetchEmploeeByEno(int eno) {
	
		return dao.getEmployeeByEno(eno);
	}
	
	@Override
	public String modifyEmployeeById(int eno, float salaryHikePercentage) {
	      //get Emplouee by id
		 Employee emp=dao.getEmployeeByEno(eno);
		 if(emp==null)
			 return "employee not found";
		 else {
			 float salary=emp.getSalary();
			 float newSalary=emp.getSalary()+(emp.getSalary()*(salaryHikePercentage/100.0f));
			emp.setSalary(newSalary);
			dao.updateEmployee(emp);
			return  "Employee is updated with new Salary "+newSalary;	
		 }
	}//method
	
	@Override
	public String deleteEmployeeById(int eno) {
		 //get Emplouee by id
		 Employee emp=dao.getEmployeeByEno(eno);
		 if(emp==null)
			 return "employee not found";
		 else {
			dao.deleteEmployee(emp);
	        return "Employee found and deleted";
		 }
	}

}//class
