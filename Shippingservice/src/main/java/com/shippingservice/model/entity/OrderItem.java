package com.shippingservice.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="order_items")
@IdClass(OrderItemId.class)
public class OrderItem {

    @Id
    @Column(name="product_id",nullable = false,updatable = false)
    private Integer productId;

    @Id
    @Column(name="order_id",nullable = false,updatable = false)
    private Integer orderId;

    private Integer orderQuantity;

}
