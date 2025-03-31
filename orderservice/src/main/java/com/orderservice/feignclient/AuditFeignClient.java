package com.orderservice.feignclient;

import com.orderservice.model.request.AuditRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "audit-service",path = "/audit")
public interface AuditFeignClient {

    @PostMapping("/log")
    public ResponseEntity<String> logEvent(@RequestBody AuditRequest log) ;
}
