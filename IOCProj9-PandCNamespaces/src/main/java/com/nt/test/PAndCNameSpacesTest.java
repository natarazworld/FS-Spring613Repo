//PAndCNameSpacesTest .java
package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class PAndCNameSpacesTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean class object(taget class obj)
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		//close container
		ctx.close();

	}

}
