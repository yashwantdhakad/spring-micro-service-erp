package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.EftAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EftAccountRepository extends JpaRepository<EftAccount, Long> {
}
