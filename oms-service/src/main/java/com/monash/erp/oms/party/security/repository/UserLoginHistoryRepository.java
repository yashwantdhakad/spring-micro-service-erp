package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserLoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginHistoryRepository extends JpaRepository<UserLoginHistory, Long> {
}
