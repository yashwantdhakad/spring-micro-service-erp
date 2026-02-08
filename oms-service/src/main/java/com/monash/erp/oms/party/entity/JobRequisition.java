package com.monash.erp.oms.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class JobRequisition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobRequisitionId;
    private BigDecimal durationMonths;
    private BigDecimal age;
    private String gender;
    private BigDecimal experienceMonths;
    private BigDecimal experienceYears;
    private String qualification;
    private String jobLocation;
    private String skillTypeId;
    private BigDecimal noOfResources;
    private String jobPostingTypeEnumId;
    private LocalDate jobRequisitionDate;
    private String examTypeEnumId;
    private LocalDate requiredOnDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
    }
public void setDurationMonths(BigDecimal durationMonths) {
        this.durationMonths = durationMonths;
    }
public void setAge(BigDecimal age) {
        this.age = age;
    }
public void setGender(String gender) {
        this.gender = gender;
    }
public void setExperienceMonths(BigDecimal experienceMonths) {
        this.experienceMonths = experienceMonths;
    }
public void setExperienceYears(BigDecimal experienceYears) {
        this.experienceYears = experienceYears;
    }
public void setQualification(String qualification) {
        this.qualification = qualification;
    }
public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
    }
public void setNoOfResources(BigDecimal noOfResources) {
        this.noOfResources = noOfResources;
    }
public void setJobPostingTypeEnumId(String jobPostingTypeEnumId) {
        this.jobPostingTypeEnumId = jobPostingTypeEnumId;
    }
public void setJobRequisitionDate(LocalDate jobRequisitionDate) {
        this.jobRequisitionDate = jobRequisitionDate;
    }
public void setExamTypeEnumId(String examTypeEnumId) {
        this.examTypeEnumId = examTypeEnumId;
    }
public void setRequiredOnDate(LocalDate requiredOnDate) {
        this.requiredOnDate = requiredOnDate;
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
