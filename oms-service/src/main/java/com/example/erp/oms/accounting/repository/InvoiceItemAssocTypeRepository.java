package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemAssocType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAssocTypeRepository extends JpaRepository<InvoiceItemAssocType, Long> {
}
