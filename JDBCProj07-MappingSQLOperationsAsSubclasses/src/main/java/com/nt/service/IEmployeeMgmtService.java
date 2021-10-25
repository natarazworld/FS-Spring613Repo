package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
    public String fetchEmpNameByNo(int no);
    public  List<Employee> fetchEmpsByDesgs(String desg1,String desg2,String desg3);
    public  String hikeEmployeeSalaryByDesg(Float bonus,String desg);
}
