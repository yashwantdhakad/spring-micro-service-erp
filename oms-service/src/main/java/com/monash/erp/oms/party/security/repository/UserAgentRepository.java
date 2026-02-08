package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgentRepository extends JpaRepository<UserAgent, Long> {
}