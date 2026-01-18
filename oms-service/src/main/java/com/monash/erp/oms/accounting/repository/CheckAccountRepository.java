package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.CheckAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckAccountRepository extends JpaRepository<CheckAccount, Long> {
}
