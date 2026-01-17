package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
