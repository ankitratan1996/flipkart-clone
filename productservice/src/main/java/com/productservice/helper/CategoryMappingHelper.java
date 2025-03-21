package com.productservice.helper;

import com.productservice.model.entity.Category;
import com.productservice.model.request.CategoryRequest;
import org.springframework.beans.BeanUtils;

public interface CategoryMappingHelper {

    public static  Category map(CategoryRequest categoryRequest) {
        if (categoryRequest == null) {
            return null;
        }

        Category category = new Category();
        BeanUtils.copyProperties(categoryRequest, category);

        if (categoryRequest.getParentCategory() != null) {
            Category parentCategory = new Category();
            parentCategory.setCategoryId(categoryRequest.getParentCategory().getCategoryId());
            category.setParentCategory(parentCategory);
        }
        else {
            category.setParentCategory(null);
        }
        return category;
    }

    public static CategoryRequest map(Category category) {
        if(category == null) {
            return null;
        }
        CategoryRequest categoryRequest = new CategoryRequest();
        BeanUtils.copyProperties(category, categoryRequest);
        if(category.getParentCategory() != null) {
            CategoryRequest parentCategoryDto = new CategoryRequest();
            BeanUtils.copyProperties(category.getParentCategory(), parentCategoryDto);
            categoryRequest.setParentCategory(parentCategoryDto);
        }
        return categoryRequest;
    }
}
