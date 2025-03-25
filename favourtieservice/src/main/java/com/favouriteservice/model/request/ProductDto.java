package com.favouriteservice.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private Integer productId;

    private String productTitle;

    private String sku;

    private Double priceUnit;

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<FavouriteDto> favouriteDtos;
}
