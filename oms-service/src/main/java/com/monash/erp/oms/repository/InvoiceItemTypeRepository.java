package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeRepository extends JpaRepository<InvoiceItemType, Long> {
}