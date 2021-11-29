package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
     public List<Employee> getAllEmployees();
     public   int  insert(Employee emp);
     public   Employee    getEmployeeByEno(int eno);
     public   int    updateEmployee(Employee emp);
     public   int  deleteEmployee(int eno);
}
