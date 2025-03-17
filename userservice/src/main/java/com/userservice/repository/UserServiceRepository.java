package com.userservice.repository;

import com.userservice.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserServiceRepository extends JpaRepository<UserInfo,Integer> {


    Optional<UserInfo> findByEmail(String email);
}
