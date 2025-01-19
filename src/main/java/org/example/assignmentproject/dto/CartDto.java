package org.example.assignmentproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.assignmentproject.model.Customer;
import org.example.assignmentproject.model.OrderItem;

import java.util.List;

public class CartDto {
    private Customer customer;
    private OrderItem orderItems;

    public CartDto(Customer customer, OrderItem orderItems) {
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public CartDto() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderItem getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem orderItems) {
        this.orderItems = orderItems;
    }
}
