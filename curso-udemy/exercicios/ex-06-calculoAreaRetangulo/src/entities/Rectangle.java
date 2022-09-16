package entities;

public class Rectangle {
     
	public double widht;
	public double height;

	
	public double area() {
		return this.widht * this.height;
	}

	public double perimeter() {
		return (this.widht * 2) + (this.height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.widht, 2) + Math.pow(this.height, 2));
	}

}
