package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeRepository extends JpaRepository<InvoiceItemType, Long> {
}
