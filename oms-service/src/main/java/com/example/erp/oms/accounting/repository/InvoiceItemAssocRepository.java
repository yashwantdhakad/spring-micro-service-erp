package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAssocRepository extends JpaRepository<InvoiceItemAssoc, Long> {
}
