package com.apigateway.repository;

import com.apigateway.model.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential,Integer>
{
}
