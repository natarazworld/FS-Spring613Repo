//Department .java
package com.nt.beans;

public class Department {
	private int deptno;
	private String deptName;
	private String deptLocation;
	public Department(int deptno, String deptName, String deptLocation) {
	System.out.println("Department.Department(-,-,-)");
		this.deptno = deptno;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}
	
	
	
	

}
