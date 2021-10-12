package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
    public int  getEmpsCount();
    public  String  getEmpNameByEmpNo(int eno);
    public  Map<String,Object>  getEmpDetailsByEmpNo(int eno);
    public  List<Map<String,Object>> getEmpDetailsByDesgs(String desg1,String desg2,String desg3);
    public  int  deleteEmpsNotHavingDeptNo();
    public   int  addBonusToEmployeesByDesgs(String desg1,String desg2, float bonus);
    public  int  insertEmployee(String ename, String desg, float salary);
}
