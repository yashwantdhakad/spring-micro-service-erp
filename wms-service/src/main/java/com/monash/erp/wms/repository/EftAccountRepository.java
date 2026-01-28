package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EftAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EftAccountRepository extends JpaRepository<EftAccount, Long> {
}