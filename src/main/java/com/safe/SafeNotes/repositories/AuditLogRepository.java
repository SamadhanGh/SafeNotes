package com.safe.SafeNotes.repositories;

import com.safe.SafeNotes.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
