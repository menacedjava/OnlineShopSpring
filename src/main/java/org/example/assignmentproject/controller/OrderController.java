package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.OrderDto;
import org.example.assignmentproject.model.Order;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Order> getOrders() {
        List<Order> orderList = orderService.findAll();
        return orderList;
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Integer id) {
        Order order = orderService.findById(id);
        return order;
    }
    @PostMapping
    public Result createOrder(@RequestBody OrderDto orderDto) {
        Result result = orderService.create(orderDto);
        return result;
    }
    @PutMapping("/{id}")
    public Result updateOrder(@PathVariable Integer id, @RequestBody OrderDto orderDto) {
        Result result = orderService.update(id, orderDto);
        return result;
    }
    @DeleteMapping("/{id}")
    public Result deleteOrder(@PathVariable Integer id) {
        Result result = orderService.delete(id);
        return result;
    }

}
