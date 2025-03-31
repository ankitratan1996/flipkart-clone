package com.apigateway.repository;

import com.apigateway.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryServiceRepository extends JpaRepository<Category,Integer> {
}
