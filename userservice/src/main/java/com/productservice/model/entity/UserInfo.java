package com.productservice.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity(name = "User_details")
@Setter
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "associatedUserInfo",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Address> associatedAddress;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credential_id", referencedColumnName = "credentailId")  // Fixed FK mapping
    private Credential credential;
}
