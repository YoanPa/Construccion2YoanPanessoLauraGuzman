package app.ports;

import java.util.List;

import app.domain.models.Order;

public interface OrderPort {
	
	boolean existsOrder(long orderId);
	
	public void saveOrder(Order order);
		
	public Order findByOrderId(long orderId);

	List<Order> findAllOrders();

	
}
