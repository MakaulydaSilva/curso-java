package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String moment = sdf2.format(new Date());

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		Client client = new Client(name, email, sdf1.parse(birthDate));

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		OrderItem orderItem;
		Product product;

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			product = new Product(nameProduct, price);
			orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}
        
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order Status: " + order.getStatus());
		System.out.println(client);

		System.out.println();
		System.out.println("Order items: ");

		for (OrderItem items : order.getItems()) {
			System.out.println(items.toString());
		}

		System.out.printf("Total price: %.2f", order.total());

		sc.close();

	}

}
