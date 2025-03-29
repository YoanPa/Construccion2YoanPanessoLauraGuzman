package app.ports;

import app.domain.models.Order;

public interface OrderPort {
	public Order createOrder(Order order);
	public Order deleteOrder(Order order);
	public Order findbyOrderId(Order orderId);
	
}
