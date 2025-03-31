package com.auditlog.service;

import com.auditlog.AuditLogApplication;
import com.auditlog.collections.AuditLog;
import com.auditlog.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AuditService {

    @Autowired
    AuditLogRepository auditLogRepository;

    public AuditLog logEvent(AuditLog log) {
        log.setTimeStamp(new Date());
        return auditLogRepository.save(log);
    }

    public List<AuditLog> findAll(){
        return auditLogRepository.findAll();
    }


    public List<AuditLog> getLogsByServiceName(String serviceName) {
        return auditLogRepository.findByServiceName(serviceName);
    }
}
