package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperatationsController {
	@Autowired
	 private  IEmployeeMgmtService service;
	
	@GetMapping("/welcome")
	public  String  showHome() {
		//return LVN
		return "home";
	}
	
	@GetMapping("/report")
	public  String  generateReport(Map<String,Object> map) {
		  //use service 
		List<Employee> listEmps=service.fetchAllEmployees();
		// keep results  as model attributes
		map.put("empsInfo", listEmps);
		//return  LVN
		return "show_report";
	}
	
	@GetMapping("/register_employee")  // to lauch  form page (Initial phase request)
	 public   String  showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		//return  LVN
		return "add_employee";
	 }
	
	
	@PostMapping("/register_employee")
	public String     processAddEmployeeForm(Map<String,Object> map,
			                                                                  @ModelAttribute("emp") Employee emp) {
		 //use  service class
		 String msg=service.registerEmployee(emp);
		 List<Employee> listEmps=service.fetchAllEmployees();
		 // keep the results in model attributes
		 map.put("empsInfo",listEmps);
		 map.put("resultMsg",msg);
		 //return LVN
		 return "show_report";
		 
		
	}

}
