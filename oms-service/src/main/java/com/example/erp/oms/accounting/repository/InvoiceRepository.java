package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
