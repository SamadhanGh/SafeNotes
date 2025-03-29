package com.safe.SafeNotes.repositories;
import com.safe.SafeNotes.models.User;
import com.safe.SafeNotes.services.AuditLogService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);
    Boolean existsByEmail(String Email);

    Optional<User> findByEmail(String email);
}

