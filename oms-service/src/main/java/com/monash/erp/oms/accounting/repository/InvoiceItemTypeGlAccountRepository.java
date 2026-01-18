package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemTypeGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeGlAccountRepository extends JpaRepository<InvoiceItemTypeGlAccount, Long> {
}
