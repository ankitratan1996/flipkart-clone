package com.userservice.service;

import com.userservice.model.entity.UserInfo;
import com.userservice.model.request.UserRequest;

public interface UserServiceInterface {
     UserInfo createANewUser(UserRequest userRequest);

     UserInfo fetchUserByUserId(Integer userId);

     UserInfo update(Integer userId, UserRequest userRequest);

     void deleteById(Integer userId);
}
