package com.capg.core.hr.service;

import com.capg.core.hr.beans.Employee;
import com.capg.core.hr.exceptions.HrException;

public interface EmployeeServiceDAO {
	public Employee viewDetails(int empid) throws HrException;
	public Double calculateSalary(int empid,int count) throws HrException;

}
