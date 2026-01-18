package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemAssocType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAssocTypeRepository extends JpaRepository<InvoiceItemAssocType, Long> {
}
