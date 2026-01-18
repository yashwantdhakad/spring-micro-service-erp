package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.SecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityGroupRepository extends JpaRepository<SecurityGroup, Long> {
}
