package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.IStudentDAO;
import com.nt.dto.StudentDTO;

public class StudentMgmtServiceImpl implements IStudentMgmtService {
	//HAS-A property
	private IStudentDAO  dao;
	
	public StudentMgmtServiceImpl(IStudentDAO dao) {
		System.out.println("StudentMgmtServiceImpl:: 1- param constructor");
		this.dao=dao;
	}
	
	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		//write b.logic to calculate total, avg and result
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=total/3.0f;
		String result=null;
		if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=75)
			result="First class with Distrinction";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=60)
			result="First class";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=50)
			result="Second  class";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=35)
			result="Third  class";
		else
			result="Fail";
		//prepare BO class obj having persistable data
		StudentBO bo=new StudentBO();
		bo.setSname(dto.getSname());//inputs
		bo.setSadd(dto.getSadd()); //inputs
		bo.setTotal(total); bo.setAvg(avg);bo.setResult(result); //results
		//use dao
		   int count=dao.insert(bo);
		   //return result
		return count==0?"Student Registration failed :: Result is::"+result :"Student registration succedded:: result is ::"+result;
	}

}
