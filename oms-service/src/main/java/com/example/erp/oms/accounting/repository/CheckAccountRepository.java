package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.CheckAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckAccountRepository extends JpaRepository<CheckAccount, Long> {
}
