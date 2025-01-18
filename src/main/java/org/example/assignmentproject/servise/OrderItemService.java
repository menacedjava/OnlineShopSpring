package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.OrderItemDto;
import org.example.assignmentproject.model.OrderItem;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(Integer id) {
        return orderItemRepository.getReferenceById(id);
    }

    public Result createOrderItem(OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(orderItem.getOrder());
        orderItem.setQuantity(orderItemDto.getQuantity());
        return new Result(true, "Saqlandi");
    }

    public Result updateOrderItem(Integer id, OrderItemDto orderItemDto) {
        OrderItem orderItem = orderItemRepository.getReferenceById(id);
        orderItem.setOrder(orderItem.getOrder());
        orderItem.setQuantity(orderItemDto.getQuantity());
        orderItemRepository.save(orderItem);
        return new Result();
    }

    public Result deleteOrderItem(Integer id) {
        OrderItem orderItem = orderItemRepository.getReferenceById(id);
        orderItemRepository.delete(orderItem);
        return new Result();
    }

}
