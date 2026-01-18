package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.EftAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EftAccountRepository extends JpaRepository<EftAccount, Long> {
}
