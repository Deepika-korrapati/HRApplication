package com.capg.core.hr.dao;

import com.capg.core.hr.beans.Employee;
import com.capg.core.hr.exceptions.HrException;

public interface EmployeeDAO {
	public Employee viewDetails(int empid) throws HrException;
	public Double calculateSalary(int empid,int count) throws HrException;

}
