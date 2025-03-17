package com.userservice.model.request;

import com.userservice.model.UserInfo;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;
    private String phone;


    public UserInfo toUserInfo(UserRequest userRequest) {
        return UserInfo.builder().
                firstName(userRequest.getFirstName()).
                lastName(userRequest.getLastName()).
                email(userRequest.email).
                phone(userRequest.phone).
                build();
    }
}
