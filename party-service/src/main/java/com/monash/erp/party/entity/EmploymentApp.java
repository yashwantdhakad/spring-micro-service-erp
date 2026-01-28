package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class EmploymentApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicationId;
    private String emplPositionId;
    private String statusId;
    private String employmentAppSourceTypeId;
    private String applyingPartyId;
    private String referredByPartyId;
    private LocalDateTime applicationDate;
    private String approverPartyId;
    private String jobRequisitionId;
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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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

    public String getEmploymentAppSourceTypeId() {
        return employmentAppSourceTypeId;
    }

    public void setEmploymentAppSourceTypeId(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
    }

    public String getApplyingPartyId() {
        return applyingPartyId;
    }

    public void setApplyingPartyId(String applyingPartyId) {
        this.applyingPartyId = applyingPartyId;
    }

    public String getReferredByPartyId() {
        return referredByPartyId;
    }

    public void setReferredByPartyId(String referredByPartyId) {
        this.referredByPartyId = referredByPartyId;
    }

    public LocalDateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApproverPartyId() {
        return approverPartyId;
    }

    public void setApproverPartyId(String approverPartyId) {
        this.approverPartyId = approverPartyId;
    }

    public String getJobRequisitionId() {
        return jobRequisitionId;
    }

    public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
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