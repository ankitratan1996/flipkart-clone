package com.orderservice.model.request;

import com.orderservice.model.entity.Carts;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {

    private Integer orderId;
    private LocalDateTime order_date;
    private String order_desc;
    private Double order_fee;
    private CartRequest cartRequest;


}
