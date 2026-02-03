package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setAuditHistorySeqId(String auditHistorySeqId) {
        this.auditHistorySeqId = auditHistorySeqId;
    }
public void setChangedEntityName(String changedEntityName) {
        this.changedEntityName = changedEntityName;
    }
public void setChangedFieldName(String changedFieldName) {
        this.changedFieldName = changedFieldName;
    }
public void setPkCombinedValueText(String pkCombinedValueText) {
        this.pkCombinedValueText = pkCombinedValueText;
    }
public void setOldValueText(String oldValueText) {
        this.oldValueText = oldValueText;
    }
public void setNewValueText(String newValueText) {
        this.newValueText = newValueText;
    }
public void setChangedDate(LocalDateTime changedDate) {
        this.changedDate = changedDate;
    }
public void setChangedByInfo(String changedByInfo) {
        this.changedByInfo = changedByInfo;
    }
public void setChangedSessionInfo(String changedSessionInfo) {
        this.changedSessionInfo = changedSessionInfo;
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
