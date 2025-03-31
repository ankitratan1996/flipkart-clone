package com.apigateway.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.apigateway.model.request.ProductRequest;
import com.apigateway.service.ProductServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service")
public class ProductController {

    @Autowired
    ProductServiceInterface productService;

    @Autowired
    ObjectMapper objectMapper;

    @PostMapping("/add")
    public ResponseEntity<String> CreateANewProduct(@RequestBody @Valid ProductRequest productRequest) throws JsonProcessingException {
        ProductRequest product=productService.createAProduct(productRequest);
        return new ResponseEntity<>(objectMapper.writeValueAsString(product), HttpStatus.CREATED);
    }

}
