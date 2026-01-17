package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceTermAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTermAttributeRepository extends JpaRepository<InvoiceTermAttribute, Long> {
}
