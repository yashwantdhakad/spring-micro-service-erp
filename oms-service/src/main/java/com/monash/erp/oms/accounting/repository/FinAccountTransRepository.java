package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccountTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountTransRepository extends JpaRepository<FinAccountTrans, Long> {
}
