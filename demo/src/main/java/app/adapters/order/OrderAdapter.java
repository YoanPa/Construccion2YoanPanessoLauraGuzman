package app.adapters.order;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.adapters.order.entity.OrderEntity;
import app.adapters.order.repository.OrderRepository;
import app.domain.models.Order;
import app.ports.OrderPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class OrderAdapter implements OrderPort {
    
    @Autowired
    private OrderRepository orderRepository;
    
    public boolean existsOrderId(Order order) {
        return orderRepository.existsById(order.getOrderId());
    }

    @Override

    public Order saveOrder(Order order) {
    	

    public void saveOrder(Order order) {
        OrderEntity orderEntity = orderAdapter(order);
        orderRepository.saveOrder(orderEntity);
        order.setOrderId(orderEntity.getOrderId());
		return order;
    }

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


    public Order findByOrderId(Order order) {
        OrderEntity orderEntity = orderRepository.findByOrderId(order.getOrderId());
        return orderAdapter(orderEntity);
    }
    
    private Order orderAdapter(OrderEntity orderEntity) {
        Order order = new Order();
        order.setOrderId(orderEntity.getOrderId());
        order.setClientId(orderEntity.getClientId());
        order.setTotalAmount(orderEntity.getTotalAmount());
        order.setDate(orderEntity.getDate());
        return order;
    }
    
    private OrderEntity orderAdapter(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(order.getOrderId());
        orderEntity.setClientId(order.getClientId());
        orderEntity.setTotalAmount(order.getTotalAmount());
        orderEntity.setDate(order.getDate());
        return orderEntity;
    }

	@Override
	public Order deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findByOrderId(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}
    }
}
