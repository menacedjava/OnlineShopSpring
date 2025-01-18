package org.example.assignmentproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.assignmentproject.model.Order;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private String paymentMethod;
    private String paymentStatus;
    private Order order;
}
