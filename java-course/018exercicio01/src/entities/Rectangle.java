package entities;

public class Rectangle {

	public double widht;
	public double height;

	public double area() {
		return widht * height;
	}

	public double perimeter() {
		return 2 * (widht + height);
	}

	public double diagonal() {
		double diagonal = Math.pow(widht, 2) + Math.pow(height, 2);
		return Math.sqrt(Math.sqrt(Math.pow(diagonal, 2)));
		
	}
}
