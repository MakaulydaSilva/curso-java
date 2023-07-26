package entities;

public class Student {
	public String name;
	public double t1, t2, t3;

	public double finalGrade() {
		return t1 + t2 + t3;
	}

	public void pass(double t1, double t2, double t3) {

		if (finalGrade() >= 60.00) {
			System.out.println("PASS");

		} else {
			double missing = 60 - finalGrade();
			System.out.printf("MISSING %.2f POINTS", missing);
		}

	}
}
