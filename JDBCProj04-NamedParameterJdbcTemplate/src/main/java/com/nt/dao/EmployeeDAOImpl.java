package com.nt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String  GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=:id";
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE  JOB IN(:dsg1,:dsg2,:dsg3)";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP (EMPNO,ENAME,JOB,SAL) VALUES(:empno,:ename,:job,:sal)";	
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	@Override
	public String getEmpNameByNo(int no) {
	    Map<String,Object> paramsMap=Map.of("id",no);  //java 9 feature
	    String name=npjt.queryForObject(GET_EMP_NAME_BY_NO, paramsMap, String.class);
		return name;
	}
	
	@Override
	public List<Employee> getEmpDetailsByDesgs(String desg1, String desg2, String desg3) {
	   //create MapSqlParameterSource class object having named param names and values
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("dsg1", desg1);
		source.addValue("dsg2", desg2);
		source.addValue("dsg3", desg3);
		List<Employee> empsList=npjt.query(GET_EMPS_BY_DESGS, //arg1
				                                                        source,  //arg2
				                                                       rs->{    //arg3  LAMDA Expression based anonymous inner class for ResultSetExtractor
				                                                    	   List<Employee> list=new ArrayList();
				                                                    	   while(rs.next()) {
				                                                    		   Employee e=new Employee();
				                                                    		   e.setEmpno(rs.getInt(1));
				                                                    		   e.setEname(rs.getString(2));
				                                                    		   e.setJob(rs.getString(3));
				                                                    		   e.setSal(rs.getFloat(4));
				                                                    		   list.add(e);
				                                                    	   }
				                                                    	   return list;
				                                                       }); 
		
		return  empsList;
	}
	
	@Override
	public int insertEmployee(Employee emp) {
		// create BeanPropertySqlParameterSource obj having Employee class obj values as the named parameter values.
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(emp); // the bean property names and  named param names must mach
		int count=npjt.update(INSERT_EMPLOYEE, source);
		return count;
	}

}
