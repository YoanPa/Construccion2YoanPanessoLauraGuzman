package app.adapters.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.hisclin.entity.HisClinEntity;
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
    public void saveOrder(Order order) {
        OrderEntity orderEntity = orderAdapter(order);
        orderRepository.save(orderEntity);
        order.setOrderId(orderEntity.getOrderId());
    }


	public Order findByOrderId(long orderId) {
		OrderEntity orderEntity = orderRepository.findByOrderId(orderId);
		return orderAdapter(orderEntity);
    }

	    private Order orderAdapter(OrderEntity orderEntity) {
        Order order = new Order();
        order.setOrderId(orderEntity.getOrderId());
        order.setPet(orderEntity.getPet());
        order.setOwner(orderEntity.getOwner());
        order.setVeterinarian(orderEntity.setVeterinarian());
        order.setMedicationName(orderEntity.getMedicationName());
        order.setCreationDate(orderEntity.getCreationDate());
        return order;
    }
    
    private OrderEntity orderAdapter(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(order.getOrderId());
        orderEntity.setPet(order.getPet());
        orderEntity.setOwner(order.getOwner());
        orderEntity.setVeterinarian(order.getVeterinarian());
        orderEntity.setMedicationName(order.getMedicationName());
        orderEntity.setCreationDate(order.getCreationDate());
        
        return orderEntity;
    }
}
