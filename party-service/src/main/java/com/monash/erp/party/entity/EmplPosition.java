package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmplPositionId() {
        return emplPositionId;
    }

    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public LocalDateTime getEstimatedFromDate() {
        return estimatedFromDate;
    }

    public void setEstimatedFromDate(LocalDateTime estimatedFromDate) {
        this.estimatedFromDate = estimatedFromDate;
    }

    public LocalDateTime getEstimatedThruDate() {
        return estimatedThruDate;
    }

    public void setEstimatedThruDate(LocalDateTime estimatedThruDate) {
        this.estimatedThruDate = estimatedThruDate;
    }

    public String getSalaryFlag() {
        return salaryFlag;
    }

    public void setSalaryFlag(String salaryFlag) {
        this.salaryFlag = salaryFlag;
    }

    public String getExemptFlag() {
        return exemptFlag;
    }

    public void setExemptFlag(String exemptFlag) {
        this.exemptFlag = exemptFlag;
    }

    public String getFulltimeFlag() {
        return fulltimeFlag;
    }

    public void setFulltimeFlag(String fulltimeFlag) {
        this.fulltimeFlag = fulltimeFlag;
    }

    public String getTemporaryFlag() {
        return temporaryFlag;
    }

    public void setTemporaryFlag(String temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
    }

    public LocalDateTime getActualFromDate() {
        return actualFromDate;
    }

    public void setActualFromDate(LocalDateTime actualFromDate) {
        this.actualFromDate = actualFromDate;
    }

    public LocalDateTime getActualThruDate() {
        return actualThruDate;
    }

    public void setActualThruDate(LocalDateTime actualThruDate) {
        this.actualThruDate = actualThruDate;
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