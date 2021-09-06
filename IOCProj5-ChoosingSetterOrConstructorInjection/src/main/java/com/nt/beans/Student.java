package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private  float  avg;
	
	public Student(int sno, String sname, float avg) {
		System.out.println("Student: 3-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}
	
	/*public void setSno(int sno) {
		System.out.println("Student.setSno()");
		this.sno = sno;
	}
	public void setSname(String sname) {
		System.out.println("Student.setSname()");
		this.sname = sname;
	}
	
	public void setAvg(float avg) {
		System.out.println("Student.setAvg()");
		this.avg = avg;
	}*/
	
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + avg + "]";
	}
	
	
	

}
