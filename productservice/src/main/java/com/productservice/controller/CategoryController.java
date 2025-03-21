package com.productservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productservice.model.entity.Category;
import com.productservice.model.request.CategoryRequest;
import com.productservice.service.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category-service")
public class CategoryController {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    CategoryServiceInterface categoryServiceInterface;

    @PostMapping("/add")
    public ResponseEntity<CategoryRequest> createACategory(@RequestBody CategoryRequest categoryRequest) throws JsonProcessingException {
        return  ResponseEntity.status(HttpStatus.CREATED).body(categoryServiceInterface.createCategory(categoryRequest));
    }

    @GetMapping("/listproduct")
    public ResponseEntity<List<CategoryRequest>>listOfProduct()
    {
        return ResponseEntity.status(HttpStatus.OK).body(categoryServiceInterface.getAllProduct());
    }

}
