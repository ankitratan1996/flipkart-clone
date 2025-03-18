package com.userservice.repository;

import com.userservice.model.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential,Integer>
{
}
