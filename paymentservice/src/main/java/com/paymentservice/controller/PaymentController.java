package com.paymentservice.controller;

import com.paymentservice.model.request.PaymentDto;
import com.paymentservice.service.PaymentService;
import com.paymentservice.service.PaymentServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentServiceInterface paymentService;

    @PostMapping
    public ResponseEntity<PaymentDto> savePayment(@RequestBody PaymentDto paymentDto){
        var output  = paymentService.save(paymentDto);
        return ResponseEntity.ok().body(output);
    }

//    @GetMapping("/{paymentId}")
//    public ResponseEntity<PaymentDto> findById(@PathVariable Integer paymentId) {
//        log.info("PaymentController :: findById");
//        return ResponseEntity.ok(paymentService.findById(paymentId));
//    }
}
