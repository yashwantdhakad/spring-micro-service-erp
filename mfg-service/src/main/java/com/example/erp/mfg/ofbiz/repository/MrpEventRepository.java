package com.example.erp.mfg.ofbiz.repository;

import com.example.erp.mfg.ofbiz.domain.MrpEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MrpEventRepository extends JpaRepository<MrpEvent, Long> {
}