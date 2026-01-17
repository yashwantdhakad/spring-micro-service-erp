package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.UserLoginPasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginPasswordHistoryRepository extends JpaRepository<UserLoginPasswordHistory, Long> {
}
