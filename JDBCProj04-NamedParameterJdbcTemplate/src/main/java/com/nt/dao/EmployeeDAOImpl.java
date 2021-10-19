package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String  GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=:id";
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	@Override
	public String getEmpNameByNo(int no) {
	    Map<String,Object> paramsMap=Map.of("id",no);  //java 9 feature
	    String name=npjt.queryForObject(GET_EMP_NAME_BY_NO, paramsMap, String.class);
		return name;
	}

}
