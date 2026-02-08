package com.monash.erp.oms.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setJobId(String jobId) {
        this.jobId = jobId;
    }
public void setJobName(String jobName) {
        this.jobName = jobName;
    }
public void setRunTime(LocalDateTime runTime) {
        this.runTime = runTime;
    }
public void setPoolId(String poolId) {
        this.poolId = poolId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
    }
public void setPreviousJobId(String previousJobId) {
        this.previousJobId = previousJobId;
    }
public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
public void setLoaderName(String loaderName) {
        this.loaderName = loaderName;
    }
public void setMaxRetry(BigDecimal maxRetry) {
        this.maxRetry = maxRetry;
    }
public void setAuthUserLoginId(String authUserLoginId) {
        this.authUserLoginId = authUserLoginId;
    }
public void setRunAsUser(String runAsUser) {
        this.runAsUser = runAsUser;
    }
public void setRuntimeDataId(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }
public void setCurrentRecurrenceCount(BigDecimal currentRecurrenceCount) {
        this.currentRecurrenceCount = currentRecurrenceCount;
    }
public void setMaxRecurrenceCount(BigDecimal maxRecurrenceCount) {
        this.maxRecurrenceCount = maxRecurrenceCount;
    }
public void setRunByInstanceId(String runByInstanceId) {
        this.runByInstanceId = runByInstanceId;
    }
public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }
public void setCancelDateTime(LocalDateTime cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
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
