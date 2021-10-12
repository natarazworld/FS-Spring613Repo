package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String  GET_EMP_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE  JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public Employee getEmpDetailsById(int eno) {
	   Employee e=jt.queryForObject(GET_EMP_BY_EMPNO,  //arg1
			                                                         (rs,rownum)->{   //lamda based anonymous inner class
			                                                        	//copy the record of RS to  Employee obj
			                                         					Employee emp=new Employee();
			                                         					emp.setEmpno(rs.getInt(1));
			                                         					emp.setEname(rs.getString(2));
			                                         					emp.setJob(rs.getString(3));
			                                         					emp.setSal(rs.getFloat(4));
			                                         					emp.setDeptno(rs.getInt(5));
			                                         					return emp; 
			                                                         },
			                                                         eno);//arg2
		return e;
	}//method


	@Override
	public List<Employee> getEmpDetailsByDesgs(String desg1, String desg2, String desg3) {

       List<Employee> empsList=jt.query(GET_EMPS_BY_DESGS,
    		                                                       rs->{
    		                                                    	   //copy the multiple recods of RS to List of Model class objs
    		                                                    	    List<Employee> listEmps=new ArrayList<Employee>();
    		                                                    	    while(rs.next()) {
    		                                                    	    	//copy each record of RS to one object Employee class
    		                                                    	    	Employee emp=new Employee();
    		                                                    	    	emp.setEmpno(rs.getInt(1));
    		                                                    	    	emp.setEname(rs.getString(2));
    		                                                    	    	emp.setJob(rs.getString(3));
    		                                                    	    	emp.setSal(rs.getFloat(4));
    		                                                    	    	emp.setDeptno(rs.getInt(5));
    		                                                    	    	//add each Object of Model class to listCollection
    		                                                    	    	listEmps.add(emp);
    		                                                    	    }//while
    		                                                    	    return listEmps;
    		                                                       },//anonymous inner class
    		                                                       desg1,desg2,desg3);
		return empsList;
	}
	
	
	/*@Override
	public Employee getEmpDetailsById(int eno) {
	   Employee emp=jt.queryForObject(GET_EMP_BY_EMPNO,  //arg1
			   new RowMapper<Employee>() {  //arg2
		     @Override
		    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		    	//copy the record of RS to  Employee obj
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					emp.setDeptno(rs.getInt(5));
					return emp;
		    }//method
	   }, //anonymous inner class
	  eno);		   //arg3
	   
	   return emp;
	}//method
	*/	
	
	/*@Override
	public Employee getEmpDetailsById(int eno) {
		Employee emp=jt.queryForObject(GET_EMP_BY_EMPNO, new EmployeeMapper(),eno);
		return emp;
	}
	
	//innner class  (callback interface implemetaiton)
	private class  EmployeeMapper  implements RowMapper<Employee>{
	
		@Override    //callback method
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			//copy the record of RS to  Employee obj
			Employee emp=new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			emp.setDeptno(rs.getInt(5));
			return emp;
		}//method
		
	}//inner class
	*/	
}
