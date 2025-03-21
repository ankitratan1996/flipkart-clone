package com.productservice.service;

import com.productservice.exception.DuplicateUserException;
import com.productservice.exception.UserDoesNotExistException;
import com.productservice.model.entity.Credential;
import com.productservice.model.entity.UserInfo;
import com.productservice.model.request.UserRequest;
import com.productservice.repository.AddressRepository;
import com.productservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userServiceRepository;

    @Autowired
    AddressRepository addressRepository;

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

        if (userRequest.getCredentialRequest() != null) {
            Credential credential = optionalUserInfo.getCredential();
            if (credential == null) {
                credential = new Credential(); // If credential does not exist, create a new one
                optionalUserInfo.setCredential(credential);
            }

            if (userRequest.getCredentialRequest().getUsername() != null) {
                credential.setUsername(userRequest.getCredentialRequest().getUsername());
            }
            if (userRequest.getCredentialRequest().getPassword() != null) {
                credential.setPassword(userRequest.getCredentialRequest().getPassword());  // Consider hashing
            }
            if (userRequest.getCredentialRequest().getRoleBasedAuthrority() != null) {
                credential.setRoleBasedAuthrority(userRequest.getCredentialRequest().getRoleBasedAuthrority());
            }
            if (userRequest.getCredentialRequest().getIsEnabled() != null) {
                credential.setIsEnabled(userRequest.getCredentialRequest().getIsEnabled());
            }
        }

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
