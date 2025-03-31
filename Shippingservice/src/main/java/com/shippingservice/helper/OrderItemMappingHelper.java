package com.shippingservice.helper;

import com.shippingservice.model.entity.OrderItem;
import com.shippingservice.model.request.OrderDto;
import com.shippingservice.model.request.OrderItemDto;
import com.shippingservice.model.request.ProductDto;

public interface OrderItemMappingHelper {

    static OrderItemDto map(OrderItem orderItem) {
        return  OrderItemDto.builder()
                .productId(orderItem.getProductId())
                .orderId(orderItem.getOrderId())
                .orderQuantity(orderItem.getOrderQuantity())
                .productDto(ProductDto.builder()
                        .productId(orderItem.getProductId())
                        .build())
                .orderDto(OrderDto.builder()
                        .orderId(orderItem.getOrderId())
                        .build())
                .build();
    }

    static OrderItem map(final OrderItemDto orderItemDto) {
        return OrderItem.builder()
                .productId(orderItemDto.getProductId())
                .orderId(orderItemDto.getOrderId())
                .orderQuantity(orderItemDto.getOrderQuantity())
                .build();
    }
}
