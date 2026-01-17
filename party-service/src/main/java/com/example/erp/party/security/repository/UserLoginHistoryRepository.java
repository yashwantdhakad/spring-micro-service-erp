package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.UserLoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginHistoryRepository extends JpaRepository<UserLoginHistory, Long> {
}
