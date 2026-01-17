package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceAttributeRepository extends JpaRepository<InvoiceAttribute, Long> {
}
