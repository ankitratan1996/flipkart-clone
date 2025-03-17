package com.userservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "User_details")
@Setter
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String phone;
}
