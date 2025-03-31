package com.apigateway.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.apigateway.model.request.RoleBasedAuthrority;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "user_credential")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer credentailId;

    @Column(unique = true)
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private RoleBasedAuthrority roleBasedAuthrority;

    private Boolean isEnabled;

    private Boolean isAccountNonExpired;

    private Boolean isAccountNonLocked;

    private Boolean isCredentailsNonExpired;

    @OneToOne(mappedBy = "credential")
    @JsonIgnore
    private UserInfo userInfo;

}
