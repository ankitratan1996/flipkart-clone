package com.orderservice.feignclient;


import com.orderservice.model.request.UserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service",path = "/user-service")
public interface UserFeignClient {

    @GetMapping(value = "/user/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserRequest> getUser (@PathVariable(value = "id")Integer userId);

}
