package com.productservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productservice.model.entity.UserInfo;
import com.productservice.model.request.UserRequest;

import com.productservice.service.UserServiceInterface;
import jakarta.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user-service")

public class UserController {

    @Autowired
    private  UserServiceInterface userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    ObjectMapper objectMapper;
    @PostMapping(value = "/created",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createUserInformation(@RequestBody @Valid UserRequest userRequest) throws JsonProcessingException {
       UserInfo userInfo =userService.createANewUser(userRequest);
        return new ResponseEntity<>(objectMapper.writeValueAsString(userInfo), HttpStatus.CREATED);
    }

    @GetMapping(value = "/user/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getUser (@PathVariable(value = "id")Integer userId) throws JsonProcessingException {
        UserInfo userInfo=userService.fetchUserByUserId(userId);
        logger.info("UserController :: fetch user details");
        return new ResponseEntity<>(objectMapper.writeValueAsString(userInfo),HttpStatus.OK);
    }

    @PatchMapping(value = "/update/{userId}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> update(@PathVariable Integer userId,
                                          @RequestBody UserRequest userRequest ) throws JsonProcessingException {
        logger.info("UserController :: update");
        UserInfo userInfo=userService.update(userId,userRequest);
        return new ResponseEntity<>(objectMapper.writeValueAsString(userInfo),HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer userId) {
        logger.info("UserController :: Delete");
        userService.deleteById(userId);
        return ResponseEntity.ok(true);
    }


}
