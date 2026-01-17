package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.SecurityPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityPermissionRepository extends JpaRepository<SecurityPermission, Long> {
}
