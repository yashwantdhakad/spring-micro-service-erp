package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.ValueLinkKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueLinkKeyRepository extends JpaRepository<ValueLinkKey, Long> {
}
