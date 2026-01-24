package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkEffortGoodStandard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkEffortGoodStandardRepository extends JpaRepository<WorkEffortGoodStandard, Long> {
    List<WorkEffortGoodStandard> findByWorkEffortId(String workEffortId);
}
