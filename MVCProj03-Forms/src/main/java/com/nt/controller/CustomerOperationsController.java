package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
	
	@GetMapping("/customer_register")  //initial phase request
	public String showForm(@ModelAttribute("cust")Customer customer) {
		
		//return LVN
		return "customer_register_form";
		
	}
	
	@PostMapping("/customer_register")  //Post back phase request
	public   String processForm(Map<String,Object> map,@ModelAttribute("cust")Customer customer) {
		//read form data and write request processing logic
		String msg=null;
		if(customer.getBillAmt()<5000)
			msg="Affordable Bill Amount";
		else
			msg="Very High Bill Amount";
		//keep results in model attributes
		map.put("resultMsg",msg);
		//return LVN
		return "show_result";
	}

}
