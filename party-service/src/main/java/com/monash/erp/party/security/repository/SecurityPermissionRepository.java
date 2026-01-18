package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.SecurityPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityPermissionRepository extends JpaRepository<SecurityPermission, Long> {
}
