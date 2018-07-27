package com.capg.core.hr.view;

import java.util.Scanner;

import com.capg.core.hr.beans.Employee;
import com.capg.core.hr.exceptions.HrException;
import com.capg.core.hr.service.EmployeeServiceDAO;
import com.capg.core.hr.service.EmployeeServiceDAOImpl;

public class Client {
	//loose coupling
	private EmployeeServiceDAO employeeService;
	//association

public Client() {
	employeeService = new EmployeeServiceDAOImpl();
}
	
	public static void main(String[] args) throws HrException {
		Client client = new Client();
		//make sure application runs forever unless you close it
		while(true)
		client.menu();
	
	}

	private void menu() throws HrException {
		System.out.println("1) Book appointment");
		System.out.println("2) view status");
		Scanner console = new Scanner(System.in);
		System.out.println("Please Select an Option:");
		int choice = console.nextInt();
		Employee employee = new Employee();
		switch (choice) {
		case 1:System.out.print("Enter ID: ");
			int id = console.nextInt();
			Employee emp = employeeService.viewDetails(id);
			emp.setEmpId(id);
			System.out.println("Emp Id" + emp.getEmpId());
			System.out.println("Name" + emp.getName());
			System.out.println("Dept "+ emp.getDept());
			System.out.println("Salary" + emp.getSalary());
			break;

		case 2:
			System.out.print("Enter ID: ");
			int id2 = console.nextInt();
			System.out.println("Enter working days:");
			int count = console.nextInt();
			
			Double sal = employeeService.calculateSalary(id2, count);
			System.out.println("Salary " + Math.floor(sal));
			break;
		}
		
	}
}
