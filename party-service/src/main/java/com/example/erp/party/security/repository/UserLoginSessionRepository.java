package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.UserLoginSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginSessionRepository extends JpaRepository<UserLoginSession, Long> {
}
