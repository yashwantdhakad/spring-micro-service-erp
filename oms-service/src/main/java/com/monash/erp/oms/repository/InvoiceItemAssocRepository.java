package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceItemAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAssocRepository extends JpaRepository<InvoiceItemAssoc, Long> {
}