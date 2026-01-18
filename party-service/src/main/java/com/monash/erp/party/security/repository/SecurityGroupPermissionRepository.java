package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.SecurityGroupPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityGroupPermissionRepository extends JpaRepository<SecurityGroupPermission, Long> {
}
