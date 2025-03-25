
package com.orderservice.helper;


import com.orderservice.model.entity.Carts;
import com.orderservice.model.entity.Orders;
import com.orderservice.model.request.CartRequest;
import com.orderservice.model.request.OrderRequest;

public interface OrderMappingHelper {

    public static OrderRequest map(Orders order)
    {
        return OrderRequest.builder()
                .orderId(order.getOrderId())
                .order_date(order.getOrder_date())
                .order_desc(order.getOrder_desc())
                .order_fee(order.getOrder_fee())
                .cartRequest(CartRequest.builder()
                        .cartId(order.getCarts().getCart_Id())
                        .build())
                .build();
    }

    public static Orders map(OrderRequest order)
    {
        return Orders.builder()
                .orderId(order.getOrderId())
                .order_date(order.getOrder_date())
                .order_desc(order.getOrder_desc())
                .order_fee(order.getOrder_fee())
                .carts(Carts.builder()
                        .cart_Id(order.getCartRequest().getCartId())
                        .build())
                .build();
    }

}
