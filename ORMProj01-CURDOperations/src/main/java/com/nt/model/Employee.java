package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ORM_EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ENO")
	private Integer eno;
	@Column(name="ENAME",length = 20)
	private  String ename;
	@Column(name="EADD",length = 20)
	private  String eadd;
	@Column(name="SALARY",length = 20)
	private  Float salary;

}
