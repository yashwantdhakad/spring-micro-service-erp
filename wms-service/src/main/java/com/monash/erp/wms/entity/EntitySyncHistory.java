package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class EntitySyncHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entitySyncId;
    private LocalDateTime startDate;
    private String runStatusId;
    private LocalDateTime beginningSynchTime;
    private LocalDateTime lastSuccessfulSynchTime;
    private LocalDateTime lastCandidateEndTime;
    private BigDecimal lastSplitStartTime;
    private BigDecimal toCreateInserted;
    private BigDecimal toCreateUpdated;
    private BigDecimal toCreateNotUpdated;
    private BigDecimal toStoreInserted;
    private BigDecimal toStoreUpdated;
    private BigDecimal toStoreNotUpdated;
    private BigDecimal toRemoveDeleted;
    private BigDecimal toRemoveAlreadyDeleted;
    private BigDecimal totalRowsExported;
    private BigDecimal totalRowsToCreate;
    private BigDecimal totalRowsToStore;
    private BigDecimal totalRowsToRemove;
    private BigDecimal totalSplits;
    private BigDecimal totalStoreCalls;
    private BigDecimal runningTimeMillis;
    private BigDecimal perSplitMinMillis;
    private BigDecimal perSplitMaxMillis;
    private BigDecimal perSplitMinItems;
    private BigDecimal perSplitMaxItems;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }
public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }
public void setBeginningSynchTime(LocalDateTime beginningSynchTime) {
        this.beginningSynchTime = beginningSynchTime;
    }
public void setLastSuccessfulSynchTime(LocalDateTime lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }
public void setLastCandidateEndTime(LocalDateTime lastCandidateEndTime) {
        this.lastCandidateEndTime = lastCandidateEndTime;
    }
public void setLastSplitStartTime(BigDecimal lastSplitStartTime) {
        this.lastSplitStartTime = lastSplitStartTime;
    }
public void setToCreateInserted(BigDecimal toCreateInserted) {
        this.toCreateInserted = toCreateInserted;
    }
public void setToCreateUpdated(BigDecimal toCreateUpdated) {
        this.toCreateUpdated = toCreateUpdated;
    }
public void setToCreateNotUpdated(BigDecimal toCreateNotUpdated) {
        this.toCreateNotUpdated = toCreateNotUpdated;
    }
public void setToStoreInserted(BigDecimal toStoreInserted) {
        this.toStoreInserted = toStoreInserted;
    }
public void setToStoreUpdated(BigDecimal toStoreUpdated) {
        this.toStoreUpdated = toStoreUpdated;
    }
public void setToStoreNotUpdated(BigDecimal toStoreNotUpdated) {
        this.toStoreNotUpdated = toStoreNotUpdated;
    }
public void setToRemoveDeleted(BigDecimal toRemoveDeleted) {
        this.toRemoveDeleted = toRemoveDeleted;
    }
public void setToRemoveAlreadyDeleted(BigDecimal toRemoveAlreadyDeleted) {
        this.toRemoveAlreadyDeleted = toRemoveAlreadyDeleted;
    }
public void setTotalRowsExported(BigDecimal totalRowsExported) {
        this.totalRowsExported = totalRowsExported;
    }
public void setTotalRowsToCreate(BigDecimal totalRowsToCreate) {
        this.totalRowsToCreate = totalRowsToCreate;
    }
public void setTotalRowsToStore(BigDecimal totalRowsToStore) {
        this.totalRowsToStore = totalRowsToStore;
    }
public void setTotalRowsToRemove(BigDecimal totalRowsToRemove) {
        this.totalRowsToRemove = totalRowsToRemove;
    }
public void setTotalSplits(BigDecimal totalSplits) {
        this.totalSplits = totalSplits;
    }
public void setTotalStoreCalls(BigDecimal totalStoreCalls) {
        this.totalStoreCalls = totalStoreCalls;
    }
public void setRunningTimeMillis(BigDecimal runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }
public void setPerSplitMinMillis(BigDecimal perSplitMinMillis) {
        this.perSplitMinMillis = perSplitMinMillis;
    }
public void setPerSplitMaxMillis(BigDecimal perSplitMaxMillis) {
        this.perSplitMaxMillis = perSplitMaxMillis;
    }
public void setPerSplitMinItems(BigDecimal perSplitMinItems) {
        this.perSplitMinItems = perSplitMinItems;
    }
public void setPerSplitMaxItems(BigDecimal perSplitMaxItems) {
        this.perSplitMaxItems = perSplitMaxItems;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
