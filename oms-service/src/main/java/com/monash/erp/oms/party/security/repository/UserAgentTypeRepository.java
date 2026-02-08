package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserAgentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgentTypeRepository extends JpaRepository<UserAgentType, Long> {
}