//WishMessageGenerator.java(target class)
package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
   //HAS- A property  (Field)
	//@Autowired   //for Field Level injection
	@Autowired  //for Field Level injection
	@Qualifier("dt1")
	private Date date;
	

	
	@Autowired
	public WishMessageGenerator(@Qualifier("dt2") Date  date) {
	   System.out.println("WishMessageGenerator::1-param construtor ::"+date);
	   this.date=date;
	}
	
	@Autowired
	@Qualifier("dt3")
	public void assgin(Date date) {
		System.out.println("WishMessageGenerator.assgin(-)::"+date);
		this.date=date;
	}
	
	
	@Autowired
	@Qualifier("dt")
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)::"+date);
		this.date=date;
	}
   
   @Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}



//B.method
   public  String generate(String user) {
	   System.out.println("injected  date property vlaue ::"+date);
	   //get hour of the day
	   int hour=date.getHours();
	   //generate wish message
	   if(hour<12)
		   return "Good Mornining::"+user;
	   else if(hour<16)
		   return "Good AfterNoon::"+user;
	   else if(hour<20)
		   return "Good Evening::"+user;
	   else
		   return "Good Night::"+user;
   }
   
   
}//class
