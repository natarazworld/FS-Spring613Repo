//MysqlStudentDAOImpl.java
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("mysqlStudDAO")
public class MysqlStudentDAOImpl implements IStudentDAO {
	private static  final String   INSERT_STUDENT_QUERY="INSERT INTO FS_LAYERED_STUDENT(SNAME,SADD,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)";
	// HAS-A property
	@Autowired
  private JdbcTemplate jt;	

	@Override
	public int insert(StudentBO bo)  {
		int count=jt.update(INSERT_STUDENT_QUERY,bo.getSname(),bo.getSadd(),bo.getTotal(),bo.getAvg(),bo.getResult());
		return count;
		}//method

}//c;ass
