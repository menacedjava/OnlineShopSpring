package org.example.assignmentproject.model;

import jakarta.persistence.*;


@Entity

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderasId;
    @ManyToOne
    private Product productid;
    @Column(nullable = false)
    private Integer quantity;
    @ManyToOne
    private Order order;

    public OrderItem(Integer orderasId, Product productid, Integer quantity, Order order) {
        this.orderasId = orderasId;
        this.productid = productid;
        this.quantity = quantity;
        this.order = order;
    }

    public OrderItem() {
    }

    public Integer getOrderId() {
        return orderasId;
    }

    public void setOrderId(Integer orderId) {
        this.orderasId = orderId;
    }

    public Product getProductid() {
        return productid;
    }

    public void setProductid(Product productid) {
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
