package com.apigateway.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity(name = "user_address")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String fullAddress;
    private String postalCode;
    private String city;
    @ManyToOne
    @JoinColumn(name = "associated_user_id", referencedColumnName = "userId")
    private UserInfo associatedUserInfo;
}
