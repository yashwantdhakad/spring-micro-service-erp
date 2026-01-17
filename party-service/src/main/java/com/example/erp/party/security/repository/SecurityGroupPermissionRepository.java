package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.SecurityGroupPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityGroupPermissionRepository extends JpaRepository<SecurityGroupPermission, Long> {
}
