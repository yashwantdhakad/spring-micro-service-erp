package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAssocRepository extends JpaRepository<InvoiceItemAssoc, Long> {
}
