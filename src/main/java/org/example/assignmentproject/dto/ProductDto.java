package org.example.assignmentproject.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private double price;
    private Integer quantity;
}
