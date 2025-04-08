package app.ports;

import app.domain.models.Order;

public interface OrderPort {
	public Order saveOrder(Order order);
	
	public Order deleteOrder(Order order);
	
	public Order findByOrderId(Long orderId);

	
}
