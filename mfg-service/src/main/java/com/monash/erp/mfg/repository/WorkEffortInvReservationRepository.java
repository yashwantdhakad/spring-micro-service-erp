package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkEffortInvReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkEffortInvReservationRepository extends JpaRepository<WorkEffortInvReservation, Long> {
    List<WorkEffortInvReservation> findByInventoryItemId(String inventoryItemId);

    List<WorkEffortInvReservation> findByWorkEffortIdAndInventoryItemIdAndWegsReferenceNumber(
            String workEffortId,
            String inventoryItemId,
            String wegsReferenceNumber
    );

    List<WorkEffortInvReservation> findByWorkEffortIdAndWegsReferenceNumber(
            String workEffortId,
            String wegsReferenceNumber
    );
}
