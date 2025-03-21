package com.productservice.repository;

import com.productservice.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends JpaRepository<Product,Integer> {


}
