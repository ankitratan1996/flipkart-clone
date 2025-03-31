package com.apigateway.service;

import com.apigateway.model.entity.UserInfo;
import com.apigateway.model.request.UserRequest;

public interface UserServiceInterface {
     UserInfo createANewUser(UserRequest userRequest);

     UserRequest fetchUserByUserId(Integer userId);

     UserInfo update(Integer userId, UserRequest userRequest);

     void deleteById(Integer userId);
}
