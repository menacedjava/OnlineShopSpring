package org.example.assignmentproject.dto;

import lombok.Data;
import org.example.assignmentproject.model.Customer;
import org.example.assignmentproject.model.OrderItem;

import java.util.List;

@Data
public class CartDto {
    private Customer customer;
    private OrderItem orderItems;
}
