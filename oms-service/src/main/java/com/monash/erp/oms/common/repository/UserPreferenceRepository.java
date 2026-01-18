package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
}
