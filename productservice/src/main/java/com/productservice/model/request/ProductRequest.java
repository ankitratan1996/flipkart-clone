package com.productservice.model.request;

import com.productservice.model.entity.Category;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

    private Integer productId;
    private String productTitle;
    private String sku;
    private Double priceUnit;
    private Integer quantity;
    private CategoryRequest categoryRequest;
}
