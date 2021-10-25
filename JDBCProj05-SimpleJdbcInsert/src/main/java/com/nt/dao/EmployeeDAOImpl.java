package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private SimpleJdbcInsert sji;
	

	/*@Override
	public int insert(Employee emp) {
		//set table name
		sji.setTableName("emp");
		//create Map object having col name and values
		Map<String ,Object> colMap=Map.of("EMPNO",emp.getEmpno(),
				                                                       "ENAME",emp.getEname(),
				                                                       "JOB",emp.getJob(),
				                                                       "SAL",emp.getSal());
		int count=sji.execute(colMap);
		return count;
	}*/
	
	/*	@Override
		public int insert(Employee emp) {
			//set table name
				sji.setTableName("emp");
				//use MapSqlParameterSource obj having  col names and values
				MapSqlParameterSource source=new MapSqlParameterSource();
				source.addValue("EMPNO",emp.getEmpno());   // colname,  col value
				source.addValue("ENAME", emp.getEname());
				source.addValue("JOB", emp.getJob());
				source.addValue("SAL",emp.getSal());
				int count=sji.execute(source);
				return count;
		}*/
	
	@Override
	public int insert(Employee emp) {
		//set table name
		sji.setTableName("emp");
		//use BeanPropertySqlParameterSource obj having Model class/Bean class obj
		 //(col names and  java bean property names must match)
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(emp);
		int count=sji.execute(source);
		return count;
	}

}
