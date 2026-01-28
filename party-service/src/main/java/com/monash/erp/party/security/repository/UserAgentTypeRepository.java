package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserAgentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgentTypeRepository extends JpaRepository<UserAgentType, Long> {
}