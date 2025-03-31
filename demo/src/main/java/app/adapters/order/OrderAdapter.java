package app.adapters.order;

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
    public void save(Order order) {
        OrderEntity orderEntity = orderAdapter(order);
        orderRepository.save(orderEntity);
        order.setOrderId(orderEntity.getOrderId());
    }

    @Override
    public Order findById(Long orderId) {
        OrderEntity orderEntity = orderRepository.findById(orderId);
        if (orderEntity == null) {
            return null;
        }
        return orderAdapter(orderEntity);
    }

    private OrderEntity orderAdapter(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(order.getOrderId());
        orderEntity.setDate(order.getDate());
        orderEntity.setTotal(order.getTotal());
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
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findbyOrderId(Order orderId) {
		// TODO Auto-generated method stub
		return null;
	}
}
