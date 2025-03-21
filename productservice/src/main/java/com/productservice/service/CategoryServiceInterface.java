package com.productservice.service;

import com.productservice.model.entity.Category;
import com.productservice.model.request.CategoryRequest;

import java.util.List;

public interface CategoryServiceInterface {
    CategoryRequest createCategory(CategoryRequest categoryRequest);

    List<CategoryRequest> getAllProduct();
}
