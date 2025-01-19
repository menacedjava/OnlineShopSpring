package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.OrderItemDto;
import org.example.assignmentproject.model.OrderItem;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.encrypt.RsaAlgorithm;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrderItemController {
    @Autowired
    OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getOrderItems() {
        List<OrderItem> all = orderItemService.findAll();
        return all;
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItem(@PathVariable Integer id) {
        OrderItem orderItemById = orderItemService.getOrderItemById(id);
        return orderItemById;
    }
    @PostMapping
    public Result createOrderItem(@RequestBody OrderItemDto orderItemDto) {
        Result orderItem = orderItemService.createOrderItem(orderItemDto);
        return orderItem;
    }
    @PutMapping("/{id}")
    public Result updateOrderItem(@PathVariable Integer id, @RequestBody OrderItemDto orderItemDto) {
        Result orderItem = orderItemService.updateOrderItem(id, orderItemDto);
        return orderItem;
    }
    @DeleteMapping("/{id}")
    public Result deleteOrderItem(@PathVariable Integer id) {
        Result orderItem = orderItemService.deleteOrderItem(id);
        return orderItem;
    }
}
