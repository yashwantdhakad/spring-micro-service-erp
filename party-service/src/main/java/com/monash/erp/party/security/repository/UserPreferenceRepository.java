package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
}