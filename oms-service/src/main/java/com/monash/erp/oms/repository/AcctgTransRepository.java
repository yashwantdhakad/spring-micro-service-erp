package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.AcctgTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransRepository extends JpaRepository<AcctgTrans, Long> {
}