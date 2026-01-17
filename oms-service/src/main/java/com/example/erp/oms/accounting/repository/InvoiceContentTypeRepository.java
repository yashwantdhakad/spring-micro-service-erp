package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceContentTypeRepository extends JpaRepository<InvoiceContentType, Long> {
}
