package com.orderservice.service;

import com.orderservice.helper.CartMappingHelper;
import com.orderservice.model.request.CartRequest;
import com.orderservice.repository.CartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CartService implements CartServiceInterface{

    @Autowired
    CartRepository cartRepository;
    @Override
    public CartRequest saveToCart(CartRequest cartRequest) {
        return  CartMappingHelper.map(cartRepository.save(CartMappingHelper.map(cartRequest)));
    }

//    @Override
//    public CartRequest findOrderById(Integer cartId) {
//        log.info("CartServiceImpl findById");
//        return cartRepository.findById(cartId)
//                .map(CartMappingHelper::map)
//                .map(c -> {
//                    c.setUserRequest(userFeignClient.findById(c.getUserId()).getBody());
//                    return c;
//                })
//                .orElseThrow(() -> new RuntimeException("Cart Id Not Found in DB"));
//    }
}
