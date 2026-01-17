package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.UserLoginSecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginSecurityGroupRepository extends JpaRepository<UserLoginSecurityGroup, Long> {
}
