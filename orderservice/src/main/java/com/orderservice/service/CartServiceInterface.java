package com.orderservice.service;

import com.orderservice.model.request.CartRequest;
import org.springframework.stereotype.Service;

@Service
public interface CartServiceInterface {

    CartRequest saveToCart(CartRequest cartRequest);

    CartRequest findOrderById(Integer cartId);
}
