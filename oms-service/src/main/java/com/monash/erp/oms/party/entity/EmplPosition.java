package com.monash.erp.oms.party.entity;

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
public class EmplPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emplPositionId;
    private String statusId;
    private String partyId;
    private String budgetId;
    private String budgetItemSeqId;
    private String emplPositionTypeId;
    private LocalDateTime estimatedFromDate;
    private LocalDateTime estimatedThruDate;
    private String salaryFlag;
    private String exemptFlag;
    private String fulltimeFlag;
    private String temporaryFlag;
    private LocalDateTime actualFromDate;
    private LocalDateTime actualThruDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }
public void setEstimatedFromDate(LocalDateTime estimatedFromDate) {
        this.estimatedFromDate = estimatedFromDate;
    }
public void setEstimatedThruDate(LocalDateTime estimatedThruDate) {
        this.estimatedThruDate = estimatedThruDate;
    }
public void setSalaryFlag(String salaryFlag) {
        this.salaryFlag = salaryFlag;
    }
public void setExemptFlag(String exemptFlag) {
        this.exemptFlag = exemptFlag;
    }
public void setFulltimeFlag(String fulltimeFlag) {
        this.fulltimeFlag = fulltimeFlag;
    }
public void setTemporaryFlag(String temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
    }
public void setActualFromDate(LocalDateTime actualFromDate) {
        this.actualFromDate = actualFromDate;
    }
public void setActualThruDate(LocalDateTime actualThruDate) {
        this.actualThruDate = actualThruDate;
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
