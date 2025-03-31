package com.shippingservice.service;

import com.shippingservice.helper.OrderItemMappingHelper;
import com.shippingservice.model.request.OrderItemDto;
import com.shippingservice.repository.OrderItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItemDto save(OrderItemDto orderItemDto){
        log.info("Saving order item: {}", orderItemDto);
        return  OrderItemMappingHelper.map(
                orderItemRepository.save(OrderItemMappingHelper.map(orderItemDto)));
    }
}
