package com.orderservice.controller;

import com.orderservice.model.request.OrderRequest;
import com.orderservice.service.OrderServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    OrderServiceInterface orderServiceInterface;
    @PostMapping
    public ResponseEntity<OrderRequest> save(@RequestBody OrderRequest orderDto) {
        return ResponseEntity.ok(orderServiceInterface.save(orderDto));
    }


    @GetMapping("/{orderId}")
    public ResponseEntity<OrderRequest> findById(@PathVariable("orderId") Integer orderId) {
        log.info("*** OrderDto, resource; fetch order by id *");
        return ResponseEntity.ok(orderServiceInterface.findById(orderId));
    }
}
