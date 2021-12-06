package com.nt.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService {
	

	 //handler method
	@Override
	public String generateWishMessage() {
		//get System date and time
		LocalDateTime  ldt=LocalDateTime.now();
		//get current hour of the day
		int hour=ldt.getHour();
		if(hour<12)
			return "Good Morning::";
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night"; 
	}
	
	

}
