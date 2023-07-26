package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee;

		employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n ", employee.name, employee.netSalary());
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double tax = sc.nextDouble();
		employee.increaseSalary(tax);
		System.out.println();
		System.out.printf("Updadted data: %s, $ %.2f", employee.name, employee.grossSalary);

		sc.close();

	}

}
