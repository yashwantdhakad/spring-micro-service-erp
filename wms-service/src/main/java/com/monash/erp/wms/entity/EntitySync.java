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
public void setId(Long id) {
        this.id = id;
    }
public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }
public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }
public void setLastSuccessfulSynchTime(LocalDateTime lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }
public void setLastHistoryStartDate(LocalDateTime lastHistoryStartDate) {
        this.lastHistoryStartDate = lastHistoryStartDate;
    }
public void setPreOfflineSynchTime(LocalDateTime preOfflineSynchTime) {
        this.preOfflineSynchTime = preOfflineSynchTime;
    }
public void setOfflineSyncSplitMillis(BigDecimal offlineSyncSplitMillis) {
        this.offlineSyncSplitMillis = offlineSyncSplitMillis;
    }
public void setSyncSplitMillis(BigDecimal syncSplitMillis) {
        this.syncSplitMillis = syncSplitMillis;
    }
public void setSyncEndBufferMillis(BigDecimal syncEndBufferMillis) {
        this.syncEndBufferMillis = syncEndBufferMillis;
    }
public void setMaxRunningNoUpdateMillis(BigDecimal maxRunningNoUpdateMillis) {
        this.maxRunningNoUpdateMillis = maxRunningNoUpdateMillis;
    }
public void setTargetServiceName(String targetServiceName) {
        this.targetServiceName = targetServiceName;
    }
public void setTargetDelegatorName(String targetDelegatorName) {
        this.targetDelegatorName = targetDelegatorName;
    }
public void setKeepRemoveInfoHours(BigDecimal keepRemoveInfoHours) {
        this.keepRemoveInfoHours = keepRemoveInfoHours;
    }
public void setForPullOnly(String forPullOnly) {
        this.forPullOnly = forPullOnly;
    }
public void setForPushOnly(String forPushOnly) {
        this.forPushOnly = forPushOnly;
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
