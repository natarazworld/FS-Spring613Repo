package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private HibernateTemplate  template;

	@Override
	public Integer insert(Employee emp) {
          template.setCheckWriteOperations(false);		// for enaling non-select operations
          int idVal=(int) template.save(emp);
		return idVal;
	}
	
	@Override
	public Employee getEmployeeByEno(Integer eno) {
		return template.get(Employee.class, eno);
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		template.update(emp);
	}
	
	@Override
	public void deleteEmployee(Employee emp) {
	   template.delete(emp);
		
	}

}
