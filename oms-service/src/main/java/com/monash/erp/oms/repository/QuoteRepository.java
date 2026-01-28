package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}