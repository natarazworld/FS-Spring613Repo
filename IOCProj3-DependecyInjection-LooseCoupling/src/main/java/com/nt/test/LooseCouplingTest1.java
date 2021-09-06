//LooseCouplingTest1.java
package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Vehicle;

public class LooseCouplingTest1 {

	public static void main(String[] args) {
		//create BeanFactory IOC container
		 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 
		 // get Spring bean class object
		 Vehicle vehicle=factory.getBean("vehicle",Vehicle.class);
		 //invoke the b.methods
		 vehicle.startVechile();
		 vehicle.move("hyd", "goa");
		 vehicle.stopVechile();
	}//main
}//class
