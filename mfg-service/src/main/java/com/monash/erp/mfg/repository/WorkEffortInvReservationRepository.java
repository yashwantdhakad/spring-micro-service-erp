package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkEffortInvReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkEffortInvReservationRepository extends JpaRepository<WorkEffortInvReservation, Long> {
    List<WorkEffortInvReservation> findByInventoryItemId(String inventoryItemId);
}
