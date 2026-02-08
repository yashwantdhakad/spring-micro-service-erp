package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PayrollPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollPreferenceRepository extends JpaRepository<PayrollPreference, Long> {
}