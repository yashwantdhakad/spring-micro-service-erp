package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTypeRepository extends JpaRepository<InvoiceType, Long> {
}