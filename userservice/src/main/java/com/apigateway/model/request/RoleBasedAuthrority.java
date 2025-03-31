package com.apigateway.model.request;

public enum RoleBasedAuthrority {

    ROLE_USER("user"),
    ROLE_ADMIN("Admin");
    private final String role;

    RoleBasedAuthrority(String role)
    {
        this.role=role;
    }

}
