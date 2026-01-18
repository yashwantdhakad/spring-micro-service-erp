package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
