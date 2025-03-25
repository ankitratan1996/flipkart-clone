package com.orderservice.service;

import com.orderservice.model.request.OrderRequest;
import org.springframework.stereotype.Service;


public interface OrderServiceInterface {

    OrderRequest save(OrderRequest orderDto);

    OrderRequest findById(Integer orderId);
}
