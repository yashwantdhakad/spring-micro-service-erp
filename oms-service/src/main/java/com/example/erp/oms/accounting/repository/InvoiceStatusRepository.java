package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Long> {
}
