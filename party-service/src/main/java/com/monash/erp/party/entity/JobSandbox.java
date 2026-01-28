package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class JobSandbox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobId;
    private String jobName;
    private LocalDateTime runTime;
    private String poolId;
    private String statusId;
    private String parentJobId;
    private String previousJobId;
    private String serviceName;
    private String loaderName;
    private BigDecimal maxRetry;
    private String authUserLoginId;
    private String runAsUser;
    private String runtimeDataId;
    private String recurrenceInfoId;
    private String tempExprId;
    private BigDecimal currentRecurrenceCount;
    private BigDecimal maxRecurrenceCount;
    private String runByInstanceId;
    private LocalDateTime startDateTime;
    private LocalDateTime finishDateTime;
    private LocalDateTime cancelDateTime;
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

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public LocalDateTime getRunTime() {
        return runTime;
    }

    public void setRunTime(LocalDateTime runTime) {
        this.runTime = runTime;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getParentJobId() {
        return parentJobId;
    }

    public void setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
    }

    public String getPreviousJobId() {
        return previousJobId;
    }

    public void setPreviousJobId(String previousJobId) {
        this.previousJobId = previousJobId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getLoaderName() {
        return loaderName;
    }

    public void setLoaderName(String loaderName) {
        this.loaderName = loaderName;
    }

    public BigDecimal getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(BigDecimal maxRetry) {
        this.maxRetry = maxRetry;
    }

    public String getAuthUserLoginId() {
        return authUserLoginId;
    }

    public void setAuthUserLoginId(String authUserLoginId) {
        this.authUserLoginId = authUserLoginId;
    }

    public String getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(String runAsUser) {
        this.runAsUser = runAsUser;
    }

    public String getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public String getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }

    public BigDecimal getCurrentRecurrenceCount() {
        return currentRecurrenceCount;
    }

    public void setCurrentRecurrenceCount(BigDecimal currentRecurrenceCount) {
        this.currentRecurrenceCount = currentRecurrenceCount;
    }

    public BigDecimal getMaxRecurrenceCount() {
        return maxRecurrenceCount;
    }

    public void setMaxRecurrenceCount(BigDecimal maxRecurrenceCount) {
        this.maxRecurrenceCount = maxRecurrenceCount;
    }

    public String getRunByInstanceId() {
        return runByInstanceId;
    }

    public void setRunByInstanceId(String runByInstanceId) {
        this.runByInstanceId = runByInstanceId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getFinishDateTime() {
        return finishDateTime;
    }

    public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    public LocalDateTime getCancelDateTime() {
        return cancelDateTime;
    }

    public void setCancelDateTime(LocalDateTime cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
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