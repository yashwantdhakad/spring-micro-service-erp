package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.MrpEventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrpEventTypeRepository extends JpaRepository<MrpEventType, Long> {
}