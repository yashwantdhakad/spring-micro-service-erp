package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.MrpEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrpEventRepository extends JpaRepository<MrpEvent, Long> {
}