package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
}
