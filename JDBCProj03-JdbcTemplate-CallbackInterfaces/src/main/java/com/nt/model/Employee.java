package com.nt.model;

public class Employee {
		private int empno;
		private String ename;
		private String job;
		private  float sal;
		private  int deptno;
		
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public float getSal() {
			return sal;
		}
		public void setSal(float sal) {
			this.sal = sal;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno="
					+ deptno + "]";
		}
		
		
		
		

}
