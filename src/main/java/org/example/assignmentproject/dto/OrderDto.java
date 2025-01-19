package org.example.assignmentproject.dto;

import org.example.assignmentproject.model.OrderItem;

public class OrderDto {
    private String customerName;
    private OrderItem orderItems;
    private double totalPrice;

    public OrderDto(String customerName, OrderItem orderItems, double totalPrice) {
        this.customerName = customerName;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
    }

    public OrderDto() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public OrderItem getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
