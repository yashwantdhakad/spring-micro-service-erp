package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRegistrationRepository extends JpaRepository<FixedAssetRegistration, Long> {
}
