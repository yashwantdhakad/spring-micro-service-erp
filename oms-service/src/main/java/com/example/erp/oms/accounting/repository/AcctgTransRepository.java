package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.AcctgTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransRepository extends JpaRepository<AcctgTrans, Long> {
}
