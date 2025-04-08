package app.adapters.order;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.order.entity.OrderEntity;
import app.adapters.order.repository.OrderRepository;
import app.domain.models.Order;
import app.ports.OrderPort;

@Service
public class OrderAdapter implements OrderPort {
    
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        OrderEntity orderEntity = orderAdapter(order);
        orderRepository.save(orderEntity);
        order.setOrderId(orderEntity.getOrderId());
		return order;
    }

    @Override
    public Order findByOrderId(Long orderId) {
        Optional<OrderEntity> orderEntity = orderRepository.findById(orderId);
        if (orderEntity == null) {
            return null;
        }
        return orderAdapter(orderEntity);
    }

    private OrderEntity orderAdapter(Optional<OrderEntity> orderEntity2) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(orderEntity2.getOrderId());
        orderEntity.setDate(orderEntity2.getDate());
        orderEntity.setTotal(orderEntity2.getTotal());
        return orderEntity;
    }

    private Order orderAdapter(OrderEntity orderEntity) {
        Order order = new Order();
        order.setOrderId(orderEntity.getOrderId());
        order.setDate(orderEntity.getDate());
        order.setTotal(orderEntity.getTotal());
        return order;
    }

	@Override
	public Order deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	}
}
