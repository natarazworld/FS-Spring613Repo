package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentMgmtService;
import com.nt.vo.StudentVO;

@Controller("controller")
public class MainController {
	 //HAS-A property
	@Autowired
	private IStudentMgmtService service;
	
	
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
