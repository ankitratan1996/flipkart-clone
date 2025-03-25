package com.orderservice.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.orderservice.model.entity.Orders;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CartRequest {

    private Integer userId;

    private Integer cartId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orders")
    Set<Orders> orderInformationSet;

    @JsonProperty("user")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    UserRequest userRequest;



}
