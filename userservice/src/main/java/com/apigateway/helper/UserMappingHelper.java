package com.apigateway.helper;

import com.apigateway.model.entity.Credential;
import com.apigateway.model.entity.UserInfo;
import com.apigateway.model.request.CredentialRequest;
import com.apigateway.model.request.UserRequest;
import org.springframework.beans.BeanUtils;

public interface UserMappingHelper {

    public static UserInfo map(UserRequest userRequest)
    {
        if(userRequest == null) {
            return null;
        }

        UserInfo user = new UserInfo();
        BeanUtils.copyProperties(userRequest, user);

        if(userRequest.getCredentialRequest() != null) {
            Credential credential = new Credential();
            BeanUtils.copyProperties(userRequest.getCredentialRequest(),credential);

            credential.setUserInfo(user);
            user.setCredential(credential);
        }
        return user;
    }

    public static UserRequest map(UserInfo user)
    {
        if(user == null) {
        return null;
    }
        UserRequest useDto = new UserRequest();
        BeanUtils.copyProperties(user, useDto);

        if(user.getCredential() != null) {
            CredentialRequest credentailDto = new CredentialRequest();
            BeanUtils.copyProperties(user.getCredential(), credentailDto);
            useDto.setCredentialRequest(credentailDto);
        }
        return useDto;
    }
}
