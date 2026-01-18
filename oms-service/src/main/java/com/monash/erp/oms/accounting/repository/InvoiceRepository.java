package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
