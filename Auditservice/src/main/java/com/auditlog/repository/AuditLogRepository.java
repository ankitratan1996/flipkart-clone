package com.auditlog.repository;

import com.auditlog.collections.AuditLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AuditLogRepository extends MongoRepository<AuditLog,String> {
    List<AuditLog> findByServiceName(String serviceName);
}
