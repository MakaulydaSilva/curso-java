package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ProgramEx {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	//--- 1º READING DATA:
		
		List <Employees> employeesList = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1));

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employeesList.add(new Employees(id, name, salary));
		}
		
	//--- 2º UPDATING SALARY OF GIVEN EMPLOYEE:	

		System.out.print("Enter the employee id that will have salary increase: ");
		double idNumber = sc.nextDouble();
		Employees attEmployee = employeesList.stream().filter(x -> x.getId() == idNumber).findFirst().orElse(null);

		if (attEmployee == null) {
			System.out.println("This id does not exist!");

		} else {

			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			attEmployee.increaseSalary(percentage);
		}
		
	//--- 3º LISTING EMPLOYEES:

		System.out.println("List of employees:");

		for (Employees obj : employeesList) {
			System.out.println(obj);
		}

		sc.close();

	}

}
