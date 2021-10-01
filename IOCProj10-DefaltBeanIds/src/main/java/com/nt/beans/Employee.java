//Employee.java
package com.nt.beans;

public class Employee {
	private int eno;
	private String ename;
	private float salary;
	private  Department dept;
	
	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public void setEno(int eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}
	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}
	public void setSalary(float salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}
	public void setDept(Department dept) {
		System.out.println("Employee.setDept()");
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
