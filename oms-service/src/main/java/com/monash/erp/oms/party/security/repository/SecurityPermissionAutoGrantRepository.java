package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.SecurityPermissionAutoGrant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityPermissionAutoGrantRepository extends JpaRepository<SecurityPermissionAutoGrant, Long> {
}