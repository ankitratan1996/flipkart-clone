package com.orderservice.service;

import com.orderservice.feignclient.AuditFeignClient;
import com.orderservice.helper.OrderMappingHelper;
import com.orderservice.model.request.AuditRequest;
import com.orderservice.model.request.OrderRequest;
import com.orderservice.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class OrderService implements OrderServiceInterface{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    AuditFeignClient auditFeignClient;
    @Override
    public OrderRequest save(OrderRequest orderDto) {

        orderDto.setOrder_date(LocalDateTime.now());
        log.info("OrderServiceIMPL :: save");
        var result=OrderMappingHelper.map(orderRepository.save(OrderMappingHelper.map(orderDto)));
        AuditRequest auditRequest =new AuditRequest("order-service","order-created",orderDto.getCartRequest().getUserId().toString());
        auditFeignClient.logEvent(auditRequest);
        return result;
    }

    @Override
    public OrderRequest findById(Integer orderId) {
        return null;
    }
}
