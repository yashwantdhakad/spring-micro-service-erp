package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserLoginPasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginPasswordHistoryRepository extends JpaRepository<UserLoginPasswordHistory, Long> {
}
