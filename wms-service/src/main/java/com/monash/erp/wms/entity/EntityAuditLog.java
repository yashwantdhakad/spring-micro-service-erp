package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class EntityAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String auditHistorySeqId;
    private String changedEntityName;
    private String changedFieldName;
    private String pkCombinedValueText;
    private String oldValueText;
    private String newValueText;
    private LocalDateTime changedDate;
    private String changedByInfo;
    private String changedSessionInfo;
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

    public String getAuditHistorySeqId() {
        return auditHistorySeqId;
    }

    public void setAuditHistorySeqId(String auditHistorySeqId) {
        this.auditHistorySeqId = auditHistorySeqId;
    }

    public String getChangedEntityName() {
        return changedEntityName;
    }

    public void setChangedEntityName(String changedEntityName) {
        this.changedEntityName = changedEntityName;
    }

    public String getChangedFieldName() {
        return changedFieldName;
    }

    public void setChangedFieldName(String changedFieldName) {
        this.changedFieldName = changedFieldName;
    }

    public String getPkCombinedValueText() {
        return pkCombinedValueText;
    }

    public void setPkCombinedValueText(String pkCombinedValueText) {
        this.pkCombinedValueText = pkCombinedValueText;
    }

    public String getOldValueText() {
        return oldValueText;
    }

    public void setOldValueText(String oldValueText) {
        this.oldValueText = oldValueText;
    }

    public String getNewValueText() {
        return newValueText;
    }

    public void setNewValueText(String newValueText) {
        this.newValueText = newValueText;
    }

    public LocalDateTime getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(LocalDateTime changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedByInfo() {
        return changedByInfo;
    }

    public void setChangedByInfo(String changedByInfo) {
        this.changedByInfo = changedByInfo;
    }

    public String getChangedSessionInfo() {
        return changedSessionInfo;
    }

    public void setChangedSessionInfo(String changedSessionInfo) {
        this.changedSessionInfo = changedSessionInfo;
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