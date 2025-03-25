package com.orderservice.controller;

import com.orderservice.model.request.CartRequest;
import com.orderservice.service.CartServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/carts")
@Slf4j
public class CartController {

    @Autowired
    CartServiceInterface cartServiceInterface;
    @PostMapping("/newCart")
    public ResponseEntity<CartRequest> save(@RequestBody CartRequest cartRequest) {
        log.info("CartController :: save");
        return ResponseEntity.ok(cartServiceInterface.saveToCart(cartRequest));
    }

//    @GetMapping("{cartId}")
//    public ResponseEntity<CartRequest> findById(@PathVariable Integer cartId){
//        log.info("CartController :: findById");
//        return ResponseEntity.ok(cartServiceInterface.findOrderById(cartId));
//    }
}
