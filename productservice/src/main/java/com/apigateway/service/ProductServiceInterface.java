package com.apigateway.service;

import com.apigateway.model.request.ProductRequest;

public interface ProductServiceInterface {
    public ProductRequest createAProduct(ProductRequest productRequest);

}
