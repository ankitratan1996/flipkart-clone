package com.userservice.service;

import com.userservice.exception.DuplicateUserException;
import com.userservice.exception.UserDoesNotExistException;
import com.userservice.model.UserInfo;
import com.userservice.model.request.UserRequest;
import com.userservice.repository.UserServiceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserServiceRepository userServiceRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserInfo createANewUser(UserRequest userRequest) {
        UserInfo transientUserInfo =userRequest.toUserInfo(userRequest);
        Optional<UserInfo> byEmail=userServiceRepository.findByEmail(transientUserInfo.getEmail());
        if(byEmail.isPresent())
        {
            throw new DuplicateUserException(byEmail.get().getEmail());
        }

        return saveorupdated(transientUserInfo);
    }

    @Override
    public UserInfo fetchUserByUserId(Integer userId) {
        return userServiceRepository.findById(userId).orElseThrow(()-> new UserDoesNotExistException(userId));
    }

    @Override
    public UserInfo update(Integer userId, UserRequest userRequest)
    {
        UserInfo optionalUserInfo=userServiceRepository.findById(userId).orElseThrow(()-> new UserDoesNotExistException(userId));

        if(optionalUserInfo.getPhone()!=null)
        optionalUserInfo.setPhone(userRequest.getPhone());

        if(optionalUserInfo.getFirstName()!=null)
        optionalUserInfo.setFirstName(userRequest.getFirstName());

        if(optionalUserInfo.getLastName()!=null)
        optionalUserInfo.setLastName(userRequest.getLastName());

        return  saveorupdated(optionalUserInfo);
    }

    @Override
    public void deleteById(Integer userId) {
         userServiceRepository.deleteById(userId);
    }

    private UserInfo saveorupdated(UserInfo userInfo) {

        return userServiceRepository.save(userInfo);
    }
}
