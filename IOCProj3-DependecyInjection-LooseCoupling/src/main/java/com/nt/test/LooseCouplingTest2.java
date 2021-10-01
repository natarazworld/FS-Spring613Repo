package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class LooseCouplingTest2 {

	public static void main(String[] args) {
		//create ApplicationContext IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 
/*		 //get target class object
		  Vehicle vehicle=(Vehicle)ctx.getBean("vehicle");
		  //invoke b.methods
		  vehicle.startVechile();
		  //vehicle.move("hyd", "goa");
		  vehicle.stopVechile();
		  System.out.println("--------------------");
		  Class c1=java.util.Date.class;
		  System.out.println("c1 obj class name "+c1.getClass()+"    "+"c1 obj data"+c1.toString());
		  try {
		  Date d1=(Date)c1.newInstance();
		  System.out.println("d1 object data"+d1.toString());
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  } */
		  
	}//main
}//class
