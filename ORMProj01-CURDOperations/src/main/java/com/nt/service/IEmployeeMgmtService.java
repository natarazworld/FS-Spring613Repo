package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
    public String registerEmployee(Employee emp);
    public  Employee  fetchEmploeeByEno(int eno);
    public  String  modifyEmployeeById(int eno, float salaryHikePercentaage);
    public  String  deleteEmployeeById(int eno);
}
