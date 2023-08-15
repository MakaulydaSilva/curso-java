package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private String moment = sdf.format(new Date());
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(String moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem items) {
		this.items.add(items);
	}
	
	public void removeItem(OrderItem items) {
		this.items.remove(items);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	
}
