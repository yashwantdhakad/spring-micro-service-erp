package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobRequisitionId() {
        return jobRequisitionId;
    }

    public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
    }

    public BigDecimal getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(BigDecimal durationMonths) {
        this.durationMonths = durationMonths;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getExperienceMonths() {
        return experienceMonths;
    }

    public void setExperienceMonths(BigDecimal experienceMonths) {
        this.experienceMonths = experienceMonths;
    }

    public BigDecimal getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(BigDecimal experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getSkillTypeId() {
        return skillTypeId;
    }

    public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
    }

    public BigDecimal getNoOfResources() {
        return noOfResources;
    }

    public void setNoOfResources(BigDecimal noOfResources) {
        this.noOfResources = noOfResources;
    }

    public String getJobPostingTypeEnumId() {
        return jobPostingTypeEnumId;
    }

    public void setJobPostingTypeEnumId(String jobPostingTypeEnumId) {
        this.jobPostingTypeEnumId = jobPostingTypeEnumId;
    }

    public LocalDate getJobRequisitionDate() {
        return jobRequisitionDate;
    }

    public void setJobRequisitionDate(LocalDate jobRequisitionDate) {
        this.jobRequisitionDate = jobRequisitionDate;
    }

    public String getExamTypeEnumId() {
        return examTypeEnumId;
    }

    public void setExamTypeEnumId(String examTypeEnumId) {
        this.examTypeEnumId = examTypeEnumId;
    }

    public LocalDate getRequiredOnDate() {
        return requiredOnDate;
    }

    public void setRequiredOnDate(LocalDate requiredOnDate) {
        this.requiredOnDate = requiredOnDate;
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