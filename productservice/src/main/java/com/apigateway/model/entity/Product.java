package com.apigateway.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product_table")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productTitle;
    @Column(unique = true)
    private String sku;
    private Double priceUnit;
    private Integer quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

}
