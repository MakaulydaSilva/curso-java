package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.thrirtd1 = sc.nextDouble();
		student.thrirtd2 = sc.nextDouble();
		student.thrirtd3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.allThrirtds());
	    System.out.println(student.passYear());
	    
	    if(student.allThrirtds() < 60) {
	    	System.out.printf("MISSING  %.2f%n", student.missing());
	    }
	    
	    sc.close();

	}

}
