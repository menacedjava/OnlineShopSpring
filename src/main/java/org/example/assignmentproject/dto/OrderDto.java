package org.example.assignmentproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.assignmentproject.model.OrderItem;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String customerName;
    private List<OrderItem> orderItems;
    private double totalPrice;
}
