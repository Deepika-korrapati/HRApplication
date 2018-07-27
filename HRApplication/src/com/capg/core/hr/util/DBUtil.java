package com.capg.core.hr.util;

import java.util.HashMap;
import java.util.Map;

import com.capg.core.hr.beans.Employee;

public class DBUtil {
	Map<Integer,Employee> myMap = new HashMap<>();
	{
	myMap.put(101,new Employee("John","Security",600400));
	myMap.put(102,new Employee("Eric","Accounts",500400));
	myMap.put(103,new Employee("John","military",400400));
	myMap.put(104,new Employee("Jain","accounts",300400));
 
}
	public Map<Integer, Employee> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Integer, Employee> myMap) {
		this.myMap = myMap;
	}
	
}