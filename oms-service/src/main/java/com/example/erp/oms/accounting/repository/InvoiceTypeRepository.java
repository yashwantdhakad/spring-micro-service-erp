package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTypeRepository extends JpaRepository<InvoiceType, Long> {
}
