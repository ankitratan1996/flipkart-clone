package com.productservice.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.productservice.model.entity.Credential;
import com.productservice.model.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CredentialRequest {

    private String username;

    private String password;

    private RoleBasedAuthrority roleBasedAuthrority;

    private Boolean isEnabled;

    private Boolean isAccountNonExpired;

    private Boolean isAccountNonLocked;

    private Boolean isCredentailsNonExpired;

    @JsonProperty("user")
    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    private UserRequest userRequest;

    public Credential toCredential() {
        Credential credential = new Credential();
        credential.setUsername(this.username);
        credential.setPassword(this.password);
        credential.setRoleBasedAuthrority(this.roleBasedAuthrority);
        credential.setIsEnabled(this.isEnabled);
        credential.setIsAccountNonExpired(this.isAccountNonExpired);
        credential.setIsAccountNonLocked(this.isAccountNonLocked);
        credential.setIsCredentailsNonExpired(this.isCredentailsNonExpired);

        // Convert userRequest to UserInfo if it exists
        if (this.userRequest != null) {
            UserInfo userInfo = this.userRequest.toUserInfo(userRequest);
            credential.setUserInfo(userInfo);
        }
        return credential;
    }
}
