package com.shippingservice.model.request;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {

    private Integer orderId;

    private LocalDateTime orderDate;

    private String orderDesc;

    private double orderFee;
}
