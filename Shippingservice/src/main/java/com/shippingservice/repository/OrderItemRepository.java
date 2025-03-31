package com.shippingservice.repository;

import com.shippingservice.model.entity.OrderItem;
import com.shippingservice.model.entity.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {
}
