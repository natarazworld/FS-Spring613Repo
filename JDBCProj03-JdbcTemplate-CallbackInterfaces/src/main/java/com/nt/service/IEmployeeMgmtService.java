package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
     public   Employee  fetchEmployeeById(int eno);      
     public  List<Employee> fetchEmployeesByDegs(String desg1,String desg2,String desg3);
}
