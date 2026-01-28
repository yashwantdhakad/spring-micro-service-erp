package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgentRepository extends JpaRepository<UserAgent, Long> {
}