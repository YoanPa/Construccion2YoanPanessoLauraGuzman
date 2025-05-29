package app.adapters.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.order.entity.OrderEntity;
import app.domain.models.Order;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
	
	boolean existsByOrderId (long orderId);
	
	Order findByOrderId(long orderId);
	
}
