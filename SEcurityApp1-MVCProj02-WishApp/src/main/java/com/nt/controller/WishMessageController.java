package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/welcome")
	public  String showHome() {
		//return LVN
		return "home";
		
	}
	
	//handler method
		@RequestMapping("/wish")
		public  String showWishMessage(Map<String,Object> map) {
			//invoke the service method
			String msg=service.generateWishMessage();
			//put the result in Model attribute
			map.put("resultMsg",msg);
			//return LVN
			return "result";
			
		}
		
		//handler method
		@RequestMapping("/contact")
		public String  showContactDetails() {
			// return LVN
			return "contact_us";
		}
		
	
	

}
