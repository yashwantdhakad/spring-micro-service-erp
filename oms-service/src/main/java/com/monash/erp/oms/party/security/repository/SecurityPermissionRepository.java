package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.SecurityPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecurityPermissionRepository extends JpaRepository<SecurityPermission, Long> {
    List<SecurityPermission> findByPermissionIdIn(List<String> permissionIds);
}
