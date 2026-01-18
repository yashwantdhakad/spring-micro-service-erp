package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeRepository extends JpaRepository<InvoiceItemType, Long> {
}
