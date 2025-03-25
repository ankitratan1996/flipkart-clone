package com.paymentservice.service;

import com.paymentservice.helper.PaymentMapping;
import com.paymentservice.model.request.PaymentDto;
import com.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements PaymentServiceInterface{

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public PaymentDto save(PaymentDto paymentDto)
    {
        return  PaymentMapping.map(paymentRepository.save(PaymentMapping.map(paymentDto)));
    }

    @Override
    public PaymentDto findById(Integer paymentId) {
        return null;
    }
}
