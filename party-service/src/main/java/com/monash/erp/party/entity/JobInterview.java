package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setJobInterviewId(String jobInterviewId) {
        this.jobInterviewId = jobInterviewId;
    }
public void setJobIntervieweePartyId(String jobIntervieweePartyId) {
        this.jobIntervieweePartyId = jobIntervieweePartyId;
    }
public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
    }
public void setJobInterviewerPartyId(String jobInterviewerPartyId) {
        this.jobInterviewerPartyId = jobInterviewerPartyId;
    }
public void setJobInterviewTypeId(String jobInterviewTypeId) {
        this.jobInterviewTypeId = jobInterviewTypeId;
    }
public void setGradeSecuredEnumId(String gradeSecuredEnumId) {
        this.gradeSecuredEnumId = gradeSecuredEnumId;
    }
public void setJobInterviewResult(String jobInterviewResult) {
        this.jobInterviewResult = jobInterviewResult;
    }
public void setJobInterviewDate(LocalDate jobInterviewDate) {
        this.jobInterviewDate = jobInterviewDate;
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
