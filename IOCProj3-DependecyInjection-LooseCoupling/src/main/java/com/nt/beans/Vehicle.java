//Vehicle.java
package com.nt.beans;

public class Vehicle {
	//HAS- Property to hold dependent class obj
   private  Engine engine;
   
   

public Vehicle() {
	System.out.println("Vehicle: 0-param constructor");
   }

 
//setter method for setter Injection
public void setEngine(Engine engine) {
	this.engine = engine;
}

 //b.methods
  public  void  startVechile() {
	  engine.startEngine();
	  System.out.println("Vechile started ");
  }
  
  public void  stopVechile() {
	  engine.stopEngine();
	  System.out.println("Vechile stopped");
  }
  
  public  void move(String startPlace, String destPlace) {
	  
	  System.out.println("jorunery started from ::"+startPlace);
	  System.out.println("jounery is goining on....");
	  try {
	  Thread.sleep(30000);
	  
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  System.out.println("jorunery ended at ::"+destPlace);
	  
  }
   
}
