package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkEffort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WorkEffortRepository extends JpaRepository<WorkEffort, Long> {
    Optional<WorkEffort> findByWorkEffortId(String workEffortId);

    List<WorkEffort> findByWorkEffortParentId(String workEffortParentId);

    Page<WorkEffort> findByWorkEffortPurposeTypeIdAndWorkEffortNameContainingIgnoreCase(
            String workEffortPurposeTypeId,
            String workEffortName,
            Pageable pageable
    );

    Page<WorkEffort> findByWorkEffortPurposeTypeId(String workEffortPurposeTypeId, Pageable pageable);
}
