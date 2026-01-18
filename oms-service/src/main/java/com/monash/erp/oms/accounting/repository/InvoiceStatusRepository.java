package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Long> {
}
