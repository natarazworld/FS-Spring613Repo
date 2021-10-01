//WishMessageGenerator.java(target class)
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
   //HAS- A property
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGeneator: 0-param constructor");
	}
   
	//setter method for setter Injection
   public void setDate(Date date) {
	   System.out.println("WishMessageGenerator.setDate()");
	   this.date=date;
   }
   
   //B.method
   public  String generate(String user) {
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
   
   
}
