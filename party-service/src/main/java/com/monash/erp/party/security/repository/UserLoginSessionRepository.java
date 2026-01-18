package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLoginSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginSessionRepository extends JpaRepository<UserLoginSession, Long> {
}
