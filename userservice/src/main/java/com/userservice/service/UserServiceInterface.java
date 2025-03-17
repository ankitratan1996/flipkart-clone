package com.userservice.service;

import com.userservice.model.UserInfo;
import com.userservice.model.request.UserRequest;

import java.util.Optional;

public interface UserServiceInterface {
     UserInfo createANewUser(UserRequest userRequest);

     UserInfo fetchUserByUserId(Integer userId);

     UserInfo update(Integer userId, UserRequest userRequest);

     void deleteById(Integer userId);
}
