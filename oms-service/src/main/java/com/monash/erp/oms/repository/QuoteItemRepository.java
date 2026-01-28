package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.QuoteItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteItemRepository extends JpaRepository<QuoteItem, Long> {
}