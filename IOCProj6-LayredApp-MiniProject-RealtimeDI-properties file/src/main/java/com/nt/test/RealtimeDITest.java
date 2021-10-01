//RealtimeDITest.java
package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		//create ApplicationContext Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//read inputs from enduser as String values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name::");
		String sname=sc.next();
		System.out.println("Enter student addrs::");
		String sadd=sc.next();
		System.out.println("Enter student Marks1::");
		String m1=sc.next();
		System.out.println("Enter student Marks2::");
		String m2=sc.next();
		System.out.println("Enter student Marks3::");
		String m3=sc.next();
		//create StudentVO class obj having inputs
		StudentVO vo=new StudentVO();
		vo.setSname(sname); vo.setSadd(sadd);
		vo.setM1(m1);vo.setM2(m2); vo.setM3(m3);
		//get Controller class object from the IOC container
		MainController controller=ctx.getBean("controller",MainController.class);
		// invoke the b.method
		try {
			String result=controller.processStudent(vo);
			System.out.println("Final Result::"+result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem ---Try again::"+e.getMessage());
		}
		
	}//main
}//class
