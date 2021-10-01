//WishMessageGenerator.java(target class)
package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")  //wmg is bean id
//@Component
@Scope("singleton")
@Lazy
public class WishMessageGenerator {
	@Autowired  //for Field Level injection
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
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
