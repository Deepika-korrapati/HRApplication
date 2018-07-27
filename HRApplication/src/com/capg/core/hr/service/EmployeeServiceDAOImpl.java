package com.capg.core.hr.service;

import com.capg.core.hr.beans.Employee;
import com.capg.core.hr.dao.EmployeeDAO;
import com.capg.core.hr.dao.EmployeeDAOImpl;
import com.capg.core.hr.exceptions.HrException;

public class EmployeeServiceDAOImpl implements EmployeeServiceDAO {
	private EmployeeDAO empdao;
	

	public EmployeeServiceDAOImpl() {
empdao = new EmployeeDAOImpl();
	}

	@Override
	public Employee viewDetails(int empid) throws HrException {
		// TODO Auto-generated method stub
		Employee emp = empdao.viewDetails(empid);
		return emp;
	}

	@Override
	public Double calculateSalary(int empid,int count) throws HrException {
	Double sal = empdao.calculateSalary(empid, count);
	return sal;
	}

}
