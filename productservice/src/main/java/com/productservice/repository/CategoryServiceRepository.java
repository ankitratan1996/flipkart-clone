package com.productservice.repository;

import com.productservice.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryServiceRepository extends JpaRepository<Category,Integer> {
}
