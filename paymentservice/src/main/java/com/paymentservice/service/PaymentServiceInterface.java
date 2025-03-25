package com.paymentservice.service;

import com.paymentservice.model.request.PaymentDto;

public interface PaymentServiceInterface {
    PaymentDto save(PaymentDto paymentDto);

    PaymentDto findById(Integer paymentId);
}
