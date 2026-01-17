package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}
