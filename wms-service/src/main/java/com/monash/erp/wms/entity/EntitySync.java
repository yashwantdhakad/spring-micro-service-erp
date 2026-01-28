package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class EntitySync {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entitySyncId;
    private String runStatusId;
    private LocalDateTime lastSuccessfulSynchTime;
    private LocalDateTime lastHistoryStartDate;
    private LocalDateTime preOfflineSynchTime;
    private BigDecimal offlineSyncSplitMillis;
    private BigDecimal syncSplitMillis;
    private BigDecimal syncEndBufferMillis;
    private BigDecimal maxRunningNoUpdateMillis;
    private String targetServiceName;
    private String targetDelegatorName;
    private BigDecimal keepRemoveInfoHours;
    private String forPullOnly;
    private String forPushOnly;
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

    public String getRunStatusId() {
        return runStatusId;
    }

    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }

    public LocalDateTime getLastSuccessfulSynchTime() {
        return lastSuccessfulSynchTime;
    }

    public void setLastSuccessfulSynchTime(LocalDateTime lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }

    public LocalDateTime getLastHistoryStartDate() {
        return lastHistoryStartDate;
    }

    public void setLastHistoryStartDate(LocalDateTime lastHistoryStartDate) {
        this.lastHistoryStartDate = lastHistoryStartDate;
    }

    public LocalDateTime getPreOfflineSynchTime() {
        return preOfflineSynchTime;
    }

    public void setPreOfflineSynchTime(LocalDateTime preOfflineSynchTime) {
        this.preOfflineSynchTime = preOfflineSynchTime;
    }

    public BigDecimal getOfflineSyncSplitMillis() {
        return offlineSyncSplitMillis;
    }

    public void setOfflineSyncSplitMillis(BigDecimal offlineSyncSplitMillis) {
        this.offlineSyncSplitMillis = offlineSyncSplitMillis;
    }

    public BigDecimal getSyncSplitMillis() {
        return syncSplitMillis;
    }

    public void setSyncSplitMillis(BigDecimal syncSplitMillis) {
        this.syncSplitMillis = syncSplitMillis;
    }

    public BigDecimal getSyncEndBufferMillis() {
        return syncEndBufferMillis;
    }

    public void setSyncEndBufferMillis(BigDecimal syncEndBufferMillis) {
        this.syncEndBufferMillis = syncEndBufferMillis;
    }

    public BigDecimal getMaxRunningNoUpdateMillis() {
        return maxRunningNoUpdateMillis;
    }

    public void setMaxRunningNoUpdateMillis(BigDecimal maxRunningNoUpdateMillis) {
        this.maxRunningNoUpdateMillis = maxRunningNoUpdateMillis;
    }

    public String getTargetServiceName() {
        return targetServiceName;
    }

    public void setTargetServiceName(String targetServiceName) {
        this.targetServiceName = targetServiceName;
    }

    public String getTargetDelegatorName() {
        return targetDelegatorName;
    }

    public void setTargetDelegatorName(String targetDelegatorName) {
        this.targetDelegatorName = targetDelegatorName;
    }

    public BigDecimal getKeepRemoveInfoHours() {
        return keepRemoveInfoHours;
    }

    public void setKeepRemoveInfoHours(BigDecimal keepRemoveInfoHours) {
        this.keepRemoveInfoHours = keepRemoveInfoHours;
    }

    public String getForPullOnly() {
        return forPullOnly;
    }

    public void setForPullOnly(String forPullOnly) {
        this.forPullOnly = forPullOnly;
    }

    public String getForPushOnly() {
        return forPushOnly;
    }

    public void setForPushOnly(String forPushOnly) {
        this.forPushOnly = forPushOnly;
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