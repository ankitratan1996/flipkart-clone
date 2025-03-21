package com.productservice.helper;

import com.productservice.model.entity.Category;
import com.productservice.model.entity.Product;
import com.productservice.model.request.CategoryRequest;
import com.productservice.model.request.ProductRequest;
import org.springframework.beans.BeanUtils;

public interface ProductMappingHelper {

    public static Product map(ProductRequest productRequest)
    {
        Category category = new Category();
        category.setCategoryId(productRequest.getCategoryRequest().getCategoryId());

        return Product.builder()
                .productId(productRequest.getProductId())
                .productTitle(productRequest.getProductTitle())
                .sku(productRequest.getSku())
                .priceUnit(productRequest.getPriceUnit())
                .quantity(productRequest.getQuantity())
                .category(category)
                .build();
    }

    public static ProductRequest map(Product product)
    {
        CategoryRequest categoryDto = new CategoryRequest();
        categoryDto.setCategoryId(product.getCategory().getCategoryId());
        categoryDto.setCategoryTitle(product.getCategory().getCategoryTitle());

        return ProductRequest.builder()
                .productId(product.getProductId())
                .productTitle(product.getProductTitle())
                .sku(product.getSku())
                .priceUnit(product.getPriceUnit())
                .quantity(product.getQuantity())
                .categoryRequest(categoryDto)
                .build();
    }

}
