package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntitySyncId() {
        return entitySyncId;
    }

    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getRunStatusId() {
        return runStatusId;
    }

    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }

    public LocalDateTime getBeginningSynchTime() {
        return beginningSynchTime;
    }

    public void setBeginningSynchTime(LocalDateTime beginningSynchTime) {
        this.beginningSynchTime = beginningSynchTime;
    }

    public LocalDateTime getLastSuccessfulSynchTime() {
        return lastSuccessfulSynchTime;
    }

    public void setLastSuccessfulSynchTime(LocalDateTime lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }

    public LocalDateTime getLastCandidateEndTime() {
        return lastCandidateEndTime;
    }

    public void setLastCandidateEndTime(LocalDateTime lastCandidateEndTime) {
        this.lastCandidateEndTime = lastCandidateEndTime;
    }

    public BigDecimal getLastSplitStartTime() {
        return lastSplitStartTime;
    }

    public void setLastSplitStartTime(BigDecimal lastSplitStartTime) {
        this.lastSplitStartTime = lastSplitStartTime;
    }

    public BigDecimal getToCreateInserted() {
        return toCreateInserted;
    }

    public void setToCreateInserted(BigDecimal toCreateInserted) {
        this.toCreateInserted = toCreateInserted;
    }

    public BigDecimal getToCreateUpdated() {
        return toCreateUpdated;
    }

    public void setToCreateUpdated(BigDecimal toCreateUpdated) {
        this.toCreateUpdated = toCreateUpdated;
    }

    public BigDecimal getToCreateNotUpdated() {
        return toCreateNotUpdated;
    }

    public void setToCreateNotUpdated(BigDecimal toCreateNotUpdated) {
        this.toCreateNotUpdated = toCreateNotUpdated;
    }

    public BigDecimal getToStoreInserted() {
        return toStoreInserted;
    }

    public void setToStoreInserted(BigDecimal toStoreInserted) {
        this.toStoreInserted = toStoreInserted;
    }

    public BigDecimal getToStoreUpdated() {
        return toStoreUpdated;
    }

    public void setToStoreUpdated(BigDecimal toStoreUpdated) {
        this.toStoreUpdated = toStoreUpdated;
    }

    public BigDecimal getToStoreNotUpdated() {
        return toStoreNotUpdated;
    }

    public void setToStoreNotUpdated(BigDecimal toStoreNotUpdated) {
        this.toStoreNotUpdated = toStoreNotUpdated;
    }

    public BigDecimal getToRemoveDeleted() {
        return toRemoveDeleted;
    }

    public void setToRemoveDeleted(BigDecimal toRemoveDeleted) {
        this.toRemoveDeleted = toRemoveDeleted;
    }

    public BigDecimal getToRemoveAlreadyDeleted() {
        return toRemoveAlreadyDeleted;
    }

    public void setToRemoveAlreadyDeleted(BigDecimal toRemoveAlreadyDeleted) {
        this.toRemoveAlreadyDeleted = toRemoveAlreadyDeleted;
    }

    public BigDecimal getTotalRowsExported() {
        return totalRowsExported;
    }

    public void setTotalRowsExported(BigDecimal totalRowsExported) {
        this.totalRowsExported = totalRowsExported;
    }

    public BigDecimal getTotalRowsToCreate() {
        return totalRowsToCreate;
    }

    public void setTotalRowsToCreate(BigDecimal totalRowsToCreate) {
        this.totalRowsToCreate = totalRowsToCreate;
    }

    public BigDecimal getTotalRowsToStore() {
        return totalRowsToStore;
    }

    public void setTotalRowsToStore(BigDecimal totalRowsToStore) {
        this.totalRowsToStore = totalRowsToStore;
    }

    public BigDecimal getTotalRowsToRemove() {
        return totalRowsToRemove;
    }

    public void setTotalRowsToRemove(BigDecimal totalRowsToRemove) {
        this.totalRowsToRemove = totalRowsToRemove;
    }

    public BigDecimal getTotalSplits() {
        return totalSplits;
    }

    public void setTotalSplits(BigDecimal totalSplits) {
        this.totalSplits = totalSplits;
    }

    public BigDecimal getTotalStoreCalls() {
        return totalStoreCalls;
    }

    public void setTotalStoreCalls(BigDecimal totalStoreCalls) {
        this.totalStoreCalls = totalStoreCalls;
    }

    public BigDecimal getRunningTimeMillis() {
        return runningTimeMillis;
    }

    public void setRunningTimeMillis(BigDecimal runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }

    public BigDecimal getPerSplitMinMillis() {
        return perSplitMinMillis;
    }

    public void setPerSplitMinMillis(BigDecimal perSplitMinMillis) {
        this.perSplitMinMillis = perSplitMinMillis;
    }

    public BigDecimal getPerSplitMaxMillis() {
        return perSplitMaxMillis;
    }

    public void setPerSplitMaxMillis(BigDecimal perSplitMaxMillis) {
        this.perSplitMaxMillis = perSplitMaxMillis;
    }

    public BigDecimal getPerSplitMinItems() {
        return perSplitMinItems;
    }

    public void setPerSplitMinItems(BigDecimal perSplitMinItems) {
        this.perSplitMinItems = perSplitMinItems;
    }

    public BigDecimal getPerSplitMaxItems() {
        return perSplitMaxItems;
    }

    public void setPerSplitMaxItems(BigDecimal perSplitMaxItems) {
        this.perSplitMaxItems = perSplitMaxItems;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}