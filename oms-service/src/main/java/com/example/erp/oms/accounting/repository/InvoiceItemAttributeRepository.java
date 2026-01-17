package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAttributeRepository extends JpaRepository<InvoiceItemAttribute, Long> {
}
