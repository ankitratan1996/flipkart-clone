package com.shippingservice.model.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {

    private Integer productId;

    private String productTitle;

    private String sku;

    private Double priceUnit;

    private Integer quantity;

}
