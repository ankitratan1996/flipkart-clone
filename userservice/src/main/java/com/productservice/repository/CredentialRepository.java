package com.productservice.repository;

import com.productservice.model.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential,Integer>
{
}
