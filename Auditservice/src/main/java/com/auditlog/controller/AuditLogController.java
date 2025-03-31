package com.auditlog.controller;

import com.auditlog.collections.AuditLog;
import com.auditlog.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditLogController {

    @Autowired
    private AuditService auditService;


    @PostMapping("/log")
    public ResponseEntity<String> logEvent(@RequestBody AuditLog log) {
        auditService.logEvent(log);
        return ResponseEntity.ok("Log saved successfully!");
    }

    @GetMapping("/logs")
    public List<AuditLog> getAllLogs() {
        return auditService.findAll();
    }

}
