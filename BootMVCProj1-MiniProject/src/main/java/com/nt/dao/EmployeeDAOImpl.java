package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String  GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	private static final String  GET_EMP_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String  INSERT_EMP_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES (ENO1_SEQ.NEXTVAL,?,?,?)";
	private static final String UPDATE_EMP_BY_NO="UPDATE EMP SET ENAME=?,JOB=?,SAL=? WHERE EMPNO=?";
	private static final String DELETE_EMP_BY_NO="DELETE EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> listEmps=jt.query(GET_ALL_EMPS,
				                                                    rs->{
				                                                    	List<Employee> al=new ArrayList();
				                                                    	while(rs.next()) {
				                                                    		Employee emp=new Employee();
				                                                    		emp.setEmpno(rs.getInt(1));
				                                                    		emp.setEname(rs.getString(2));
				                                                    		emp.setJob(rs.getString(3));
				                                                    		emp.setSal(rs.getFloat(4));
				                                                    		al.add(emp);
				                                                    	}//while
				                                                    	return al;
				                                                    } // LAMDA anonymous inner class
				                                                    ); //method class
		System.out.println("DAO :"+listEmps.size());
				                                                 
		return listEmps;
	}
	
	
	@Override
	public int deleteEmployee(int eno) {
		int  count=jt.update(DELETE_EMP_BY_NO,eno);
		return count;
	}
	

	@Override
	public int insert(Employee emp) {
	      int count=jt.update(INSERT_EMP_QUERY,emp.getEname(),emp.getJob(),emp.getSal());
		return count;
	}

	@Override
	public Employee getEmployeeByEno(int eno) {
		Employee  emp=jt.queryForObject(GET_EMP_BY_ID, 
				 (rs,rownum)->{
          			Employee e=new Employee();
          			e.setEmpno(rs.getInt(1));
          			e.setEname(rs.getString(2));
          			e.setJob(rs.getString(3));
          			e.setSal(rs.getFloat(4));
			      return e;
		},
		eno);	
		System.out.println(emp);
		return emp;
	}//method
	
	@Override
	public int updateEmployee(Employee emp) {
	   int count=jt.update(UPDATE_EMP_BY_NO,
			                              emp.getEname(),
			                              emp.getJob(),
			                              emp.getSal(),
			                              emp.getEmpno());
		return count;
	}
}//class
