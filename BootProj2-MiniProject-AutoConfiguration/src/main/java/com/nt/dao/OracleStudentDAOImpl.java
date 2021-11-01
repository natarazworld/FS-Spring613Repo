package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("oraStudDAO")
public class OracleStudentDAOImpl implements IStudentDAO {
	private static  final String   INSERT_STUDENT_QUERY="INSERT INTO FS_LAYERED_STUDENT VALUES(FS_SNO_SEQ.NEXTVAL,?,?,?,?,?)";
	// HAS-A property
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public int insert(StudentBO bo) {
		System.out.println("ds="+jt.getDataSource().getClass());
		int count=jt.update(INSERT_STUDENT_QUERY, bo.getSname(),bo.getSadd(),bo.getTotal(),bo.getAvg(),bo.getResult());
	    return count;
	}//method

}//c;ass
