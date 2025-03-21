package com.productservice.service;

import com.productservice.model.entity.Category;
import com.productservice.model.request.CategoryRequest;
import com.productservice.repository.CategoryServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.productservice.helper.CategoryMappingHelper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryService implements CategoryServiceInterface{

    @Autowired
    CategoryServiceRepository categoryServiceRepository;
    @Override
    public CategoryRequest createCategory(CategoryRequest categoryRequest) {

        Category parentCategory = null;
        if (categoryRequest.getParentCategory() != null) {
            Integer id = categoryRequest.getParentCategory().getCategoryId();
            parentCategory = categoryServiceRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Parent Category Not Found"));
        }
        Category category = CategoryMappingHelper.map(categoryRequest);

        if (parentCategory != null) {
            category.setParentCategory(parentCategory);
        }

        return CategoryMappingHelper.map(categoryServiceRepository.save(category));
    }

    @Override
    public List<CategoryRequest> getAllProduct() {
       return categoryServiceRepository.findAll().
        stream().map(CategoryMappingHelper::map).collect(Collectors.toList());


    }


}
