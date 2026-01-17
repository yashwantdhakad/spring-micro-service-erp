package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceContentRepository extends JpaRepository<InvoiceContent, Long> {
}
