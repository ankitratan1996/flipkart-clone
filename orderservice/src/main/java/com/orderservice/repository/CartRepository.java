package com.orderservice.repository;

import com.orderservice.model.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<Carts,Integer> {
}
