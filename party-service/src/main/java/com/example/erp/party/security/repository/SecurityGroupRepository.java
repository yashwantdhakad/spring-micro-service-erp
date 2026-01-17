package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.SecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityGroupRepository extends JpaRepository<SecurityGroup, Long> {
}
