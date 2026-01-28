package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PayrollPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollPreferenceRepository extends JpaRepository<PayrollPreference, Long> {
}