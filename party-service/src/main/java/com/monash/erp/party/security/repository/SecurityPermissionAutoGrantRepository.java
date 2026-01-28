package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.SecurityPermissionAutoGrant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityPermissionAutoGrantRepository extends JpaRepository<SecurityPermissionAutoGrant, Long> {
}