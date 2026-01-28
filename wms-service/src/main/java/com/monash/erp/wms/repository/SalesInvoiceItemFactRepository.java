package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SalesInvoiceItemFact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesInvoiceItemFactRepository extends JpaRepository<SalesInvoiceItemFact, Long> {
}