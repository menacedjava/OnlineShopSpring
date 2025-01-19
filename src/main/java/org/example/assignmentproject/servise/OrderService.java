package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.OrderDto;
import org.example.assignmentproject.model.Order;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Integer id) {
        return orderRepository.findById(id).get();
    }
    public Result create(OrderDto orderDto) {
        Order order = new Order();
        order.setCustomerName(orderDto.getCustomerName());
        order.setTotalPrice(orderDto.getTotalPrice());
        orderRepository.save(order);
        return new Result(true,"Saqlandi");
    }

    public Result update(Integer id,OrderDto orderDto) {
        if (orderRepository.findById(id).isPresent()) {
            Order order = orderRepository.findById(id).get();
            order.setCustomerName(orderDto.getCustomerName());
            orderRepository.save(order);
            return new Result(true,"OK");
        }
        return new Result(false,"Not Found");
    }

    public Result delete(Integer id) {
       if (orderRepository.findById(id).isPresent()) {
           orderRepository.deleteById(id);
           return new Result(true,"Successfully deleted order");
       }
       return new Result(false,"Not found Mazgi");
    }




}
