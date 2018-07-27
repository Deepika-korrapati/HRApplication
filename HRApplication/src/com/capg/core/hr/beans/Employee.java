package com.capg.core.hr.beans;

public class Employee {
	private int empId;
	private String name;
	private String Dept;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String name, String dept, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		Dept = dept;
		this.salary = salary;
	}
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Dept=" + Dept + ", salary=" + salary + "]";
	}
	public Employee(String name, String dept, double salary) {
		super();
		this.name = name;
		Dept = dept;
		this.salary = salary;
	}
	
	

}
