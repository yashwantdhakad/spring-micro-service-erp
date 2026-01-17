package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemTypeGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeGlAccountRepository extends JpaRepository<InvoiceItemTypeGlAccount, Long> {
}
