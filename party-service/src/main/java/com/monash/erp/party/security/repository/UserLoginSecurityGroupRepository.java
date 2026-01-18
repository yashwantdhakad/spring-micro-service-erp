package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLoginSecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginSecurityGroupRepository extends JpaRepository<UserLoginSecurityGroup, Long> {
}
