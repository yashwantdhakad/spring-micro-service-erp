package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLoginPasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginPasswordHistoryRepository extends JpaRepository<UserLoginPasswordHistory, Long> {
}
