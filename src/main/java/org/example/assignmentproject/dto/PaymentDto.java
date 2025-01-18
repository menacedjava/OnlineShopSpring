package org.example.assignmentproject.dto;

import lombok.Data;
import org.example.assignmentproject.model.Order;

@Data
public class PaymentDto {
    private String paymentMethod;
    private String paymentStatus;
    private Order order;
}
