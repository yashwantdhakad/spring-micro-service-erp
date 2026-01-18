package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRoleRepository extends JpaRepository<InvoiceRole, Long> {
}
