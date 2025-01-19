package org.example.assignmentproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.assignmentproject.model.Order;


public class OrderItemDto {
    private Integer orderItemId;
    private Integer productid;
    private Integer quantity;
    private Order order;

    public OrderItemDto(Integer orderItemId, Integer productid, Integer quantity, Order order) {
        this.orderItemId = orderItemId;
        this.productid = productid;
        this.quantity = quantity;
        this.order = order;
    }

    public OrderItemDto() {
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
