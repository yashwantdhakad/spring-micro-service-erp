package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.RateAmount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateAmountRepository extends JpaRepository<RateAmount, Long> {
}
