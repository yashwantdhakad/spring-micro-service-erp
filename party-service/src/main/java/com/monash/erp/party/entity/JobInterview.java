package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class JobInterview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobInterviewId;
    private String jobIntervieweePartyId;
    private String jobRequisitionId;
    private String jobInterviewerPartyId;
    private String jobInterviewTypeId;
    private String gradeSecuredEnumId;
    private String jobInterviewResult;
    private LocalDate jobInterviewDate;
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

    public String getJobInterviewId() {
        return jobInterviewId;
    }

    public void setJobInterviewId(String jobInterviewId) {
        this.jobInterviewId = jobInterviewId;
    }

    public String getJobIntervieweePartyId() {
        return jobIntervieweePartyId;
    }

    public void setJobIntervieweePartyId(String jobIntervieweePartyId) {
        this.jobIntervieweePartyId = jobIntervieweePartyId;
    }

    public String getJobRequisitionId() {
        return jobRequisitionId;
    }

    public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
    }

    public String getJobInterviewerPartyId() {
        return jobInterviewerPartyId;
    }

    public void setJobInterviewerPartyId(String jobInterviewerPartyId) {
        this.jobInterviewerPartyId = jobInterviewerPartyId;
    }

    public String getJobInterviewTypeId() {
        return jobInterviewTypeId;
    }

    public void setJobInterviewTypeId(String jobInterviewTypeId) {
        this.jobInterviewTypeId = jobInterviewTypeId;
    }

    public String getGradeSecuredEnumId() {
        return gradeSecuredEnumId;
    }

    public void setGradeSecuredEnumId(String gradeSecuredEnumId) {
        this.gradeSecuredEnumId = gradeSecuredEnumId;
    }

    public String getJobInterviewResult() {
        return jobInterviewResult;
    }

    public void setJobInterviewResult(String jobInterviewResult) {
        this.jobInterviewResult = jobInterviewResult;
    }

    public LocalDate getJobInterviewDate() {
        return jobInterviewDate;
    }

    public void setJobInterviewDate(LocalDate jobInterviewDate) {
        this.jobInterviewDate = jobInterviewDate;
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