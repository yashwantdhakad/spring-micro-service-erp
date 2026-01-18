package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.WebUserPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebUserPreferenceRepository extends JpaRepository<WebUserPreference, Long> {
}