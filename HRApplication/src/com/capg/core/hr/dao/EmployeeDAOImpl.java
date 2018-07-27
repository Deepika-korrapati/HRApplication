package com.capg.core.hr.dao;

import java.util.List;
import java.util.Map;

import com.capg.core.hr.beans.Employee;
import com.capg.core.hr.exceptions.HrException;
import com.capg.core.hr.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
private Map<Integer,Employee> mymap;
private DBUtil dbutil = new DBUtil();


	public EmployeeDAOImpl() {
		mymap = dbutil.getMyMap();

}

	@Override
	public Employee viewDetails(int empid) throws HrException {
		Employee employee = mymap.get(empid);
		if(employee==null)
			throw new HrException("employee not found with id" +empid);
		return employee ;
	}

	@Override
	public Double calculateSalary(int empid, int count) throws HrException {
		if(mymap.containsKey(empid)==false)
			throw new HrException("ID is not found");
		Employee emp =  mymap.get(empid);
		Double actualsalary=emp.getSalary();
		Double sal = ((actualsalary/12)/31)*count;
		System.out.println(sal);
		
		return sal;
	}

}
