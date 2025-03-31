package com.orderservice.service;

import com.orderservice.feignclient.UserFeignClient;
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
    private CartRepository cartRepository;

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public CartRequest saveToCart(CartRequest cartRequest) {
        return  CartMappingHelper.map(cartRepository.save(CartMappingHelper.map(cartRequest)));
    }

    @Override
    public CartRequest findOrderById(Integer cartId) {
        log.info("CartServiceImpl findById");
        return cartRepository.findById(cartId)
                .map(CartMappingHelper::map)
                .map(cartRequest -> {
                    cartRequest.setUserRequest(userFeignClient.getUser(cartRequest.getUserId()).getBody());
                    return cartRequest;
                })
                .orElseThrow(() -> new RuntimeException("Cart Id Not Found in DB"));
    }
}
