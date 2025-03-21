package com.productservice.service;

import com.productservice.model.entity.Product;
import com.productservice.model.request.ProductRequest;

public interface ProductServiceInterface {
    public ProductRequest createAProduct(ProductRequest productRequest);

}
