package com.monash.erp.party.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setEmploymentAppSourceTypeId(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
    }
public void setApplyingPartyId(String applyingPartyId) {
        this.applyingPartyId = applyingPartyId;
    }
public void setReferredByPartyId(String referredByPartyId) {
        this.referredByPartyId = referredByPartyId;
    }
public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }
public void setApproverPartyId(String approverPartyId) {
        this.approverPartyId = approverPartyId;
    }
public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
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
