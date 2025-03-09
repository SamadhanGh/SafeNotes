package com.safe.SafeNotes.repositories;


import com.safe.SafeNotes.models.AppRole;
import com.safe.SafeNotes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}