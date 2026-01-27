package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
    List<InvoiceItem> findByInvoiceId(String invoiceId);
}
