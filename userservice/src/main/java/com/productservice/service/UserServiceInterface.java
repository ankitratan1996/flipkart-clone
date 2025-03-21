package com.productservice.service;

import com.productservice.model.entity.UserInfo;
import com.productservice.model.request.UserRequest;

public interface UserServiceInterface {
     UserInfo createANewUser(UserRequest userRequest);

     UserInfo fetchUserByUserId(Integer userId);

     UserInfo update(Integer userId, UserRequest userRequest);

     void deleteById(Integer userId);
}
