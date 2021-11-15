package com.nt.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@RequestMapping("/welcome")
	public String showHomePage(Model model) {
		//add model attribute
		model.addAttribute("sysDate",new Date());
		//return LVN
		return "home";
		
	}

}
