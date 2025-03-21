package com.productservice.service;

import com.productservice.helper.ProductMappingHelper;
import com.productservice.model.entity.Product;
import com.productservice.model.request.ProductRequest;
import com.productservice.repository.CategoryServiceRepository;
import com.productservice.repository.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceInterface {

    @Autowired
    ProductServiceRepository productServiceRepository;

    @Autowired
    CategoryServiceRepository categoryServiceRepository;
    @Override
    public ProductRequest createAProduct(ProductRequest productRequest)
    {
        Product product= ProductMappingHelper.map(productRequest);

        var dbCategory=categoryServiceRepository.findById(productRequest.getCategoryRequest().getCategoryId())
                .orElseThrow(()->new RuntimeException("Category doesn't exist in DB"));
       product.setCategory(dbCategory);
       return ProductMappingHelper.map(productServiceRepository.save(product));

    }


}
