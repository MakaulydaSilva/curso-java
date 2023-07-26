package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ProgramEx03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		
		student = new Student();
		
		student.name = sc.nextLine();
		student.t1 = sc.nextDouble();
		student.t2 = sc.nextDouble();
		student.t3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		student.pass(student.t1, student.t2, student.t3);
		
		sc.close();

	}

}
