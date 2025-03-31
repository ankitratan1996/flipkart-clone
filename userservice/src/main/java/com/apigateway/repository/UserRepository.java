package com.apigateway.repository;

import com.apigateway.model.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {


    Optional<UserInfo> findByEmail(String email);
}
