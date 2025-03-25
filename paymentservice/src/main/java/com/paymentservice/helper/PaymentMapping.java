package com.paymentservice.helper;

import com.paymentservice.model.entity.Payment;
import com.paymentservice.model.request.OrderDto;
import com.paymentservice.model.request.PaymentDto;

public interface PaymentMapping {

    public static PaymentDto map(Payment payment)
    {
        return PaymentDto.builder().
                paymentId(payment.getPaymentId()).
                isPayed(payment.getIsPayed()).
                paymentStatus(payment.getPaymentStatus()).
                orderDto(OrderDto.builder().orderId(payment.getOrderId())
                        .build()).build();
    }

    public static Payment map(PaymentDto paymentDto)
    {
        return Payment.builder().
                paymentId(paymentDto.getPaymentId()).
                orderId(paymentDto.getOrderDto().getOrderId()).
                isPayed(paymentDto.getIsPayed()).
                paymentStatus(paymentDto.getPaymentStatus())
                .build();
    }
}
