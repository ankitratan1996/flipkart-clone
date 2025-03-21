package com.productservice.model.request;

import com.productservice.model.entity.UserInfo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String phone;

    private Set<AddressRequest> addressSet;

    private CredentialRequest credentialRequest;

    public UserInfo toUserInfo(UserRequest userRequest) {
        return UserInfo.builder().
                firstName(userRequest.getFirstName()).
                lastName(userRequest.getLastName()).
                email(userRequest.getEmail()).
                phone(userRequest.getPhone()).
                credential(userRequest.getCredentialRequest()!=null?userRequest.getCredentialRequest().toCredential():null).
                build();
    }
}
