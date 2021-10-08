package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_NAME_BY_EMPNO="SELECT ENAME FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)";
	private static final String DELETE_EMPS_WITH_NO_DEPTNO="DELETE FROM EMP WHERE DEPTNO IS NULL";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
       this.jt=jt;
	}

	@Override
	public int getEmpsCount() {
		int count=jt.queryForObject(GET_EMPS_COUNT, Integer.class ); //query, required type
		return count;
	}
	
	@Override
	public String getEmpNameByEmpNo(int eno) {
		                            //queryForObject(query, requiredType, ... paramvalues) 
		String name=jt.queryForObject(GET_EMP_NAME_BY_EMPNO,String.class,eno);
		return name;
	}
	
	@Override
	public Map<String, Object> getEmpDetailsByEmpNo(int eno) {
		Map<String,Object> map=jt.queryForMap(GET_EMP_DETAILS_BY_EMPNO,eno);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> getEmpDetailsByDesgs(String desg1,String desg2,String desg3) {
	      List<Map<String,Object>> empsList=jt.queryForList(GET_EMP_DETAILS_BY_DESGS,desg1,desg2,desg3);
		return empsList;
	}
	
	@Override
	public int deleteEmpsNotHavingDeptNo() {
		int count=jt.update(DELETE_EMPS_WITH_NO_DEPTNO);
		return count;
	}

}
