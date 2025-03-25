package com.paymentservice.model.request;

import lombok.*;

import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private Integer orderId;
    private LocalDateTime order_date;
    private String order_desc;
    private Double order_fee;


}
