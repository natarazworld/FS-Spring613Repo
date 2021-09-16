package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentMgmtService;
import com.nt.vo.StudentVO;

public class MainController {
	 //HAS-A property
	private IStudentMgmtService service;
	
	public MainController(IStudentMgmtService service) {
		System.out.println("MainController:: 1-param constructor");
		 this.service=service;
	}
	
	public String processStudent(StudentVO vo)throws Exception{
		//convert StudentVO class obj to StudentDTO class obj
		StudentDTO dto=new  StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		String result=service.generateResult(dto);
		return result;
	}
	

}
