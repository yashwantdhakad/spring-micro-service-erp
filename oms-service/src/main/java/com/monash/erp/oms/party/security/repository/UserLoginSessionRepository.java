package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserLoginSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginSessionRepository extends JpaRepository<UserLoginSession, Long> {
}
