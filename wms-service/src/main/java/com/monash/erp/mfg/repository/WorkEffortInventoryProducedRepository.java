package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkEffortInventoryProduced;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkEffortInventoryProducedRepository extends JpaRepository<WorkEffortInventoryProduced, Long> {
    List<WorkEffortInventoryProduced> findByWorkEffortId(String workEffortId);
}
