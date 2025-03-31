package com.apigateway.service;

import com.apigateway.model.request.CategoryRequest;

import java.util.List;

public interface CategoryServiceInterface {
    CategoryRequest createCategory(CategoryRequest categoryRequest);

    List<CategoryRequest> getAllProduct();
}
