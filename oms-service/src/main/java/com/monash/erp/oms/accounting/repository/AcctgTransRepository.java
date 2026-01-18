package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.AcctgTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransRepository extends JpaRepository<AcctgTrans, Long> {
}

