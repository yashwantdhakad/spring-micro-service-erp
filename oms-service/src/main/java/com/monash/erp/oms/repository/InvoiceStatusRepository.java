package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Long> {
}