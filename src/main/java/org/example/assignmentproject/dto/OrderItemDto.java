package org.example.assignmentproject.dto;

import lombok.Data;

@Data
public class OrderItemDto {
    private Integer orderItemId;
    private Integer productid;
    private Integer quantity;

}
