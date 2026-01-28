package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class RecurrenceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recurrenceInfoId;
    private LocalDateTime startDateTime;
    private String exceptionDateTimes;
    private String recurrenceDateTimes;
    private String exceptionRuleId;
    private String recurrenceRuleId;
    private BigDecimal recurrenceCount;
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

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getExceptionDateTimes() {
        return exceptionDateTimes;
    }

    public void setExceptionDateTimes(String exceptionDateTimes) {
        this.exceptionDateTimes = exceptionDateTimes;
    }

    public String getRecurrenceDateTimes() {
        return recurrenceDateTimes;
    }

    public void setRecurrenceDateTimes(String recurrenceDateTimes) {
        this.recurrenceDateTimes = recurrenceDateTimes;
    }

    public String getExceptionRuleId() {
        return exceptionRuleId;
    }

    public void setExceptionRuleId(String exceptionRuleId) {
        this.exceptionRuleId = exceptionRuleId;
    }

    public String getRecurrenceRuleId() {
        return recurrenceRuleId;
    }

    public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }

    public BigDecimal getRecurrenceCount() {
        return recurrenceCount;
    }

    public void setRecurrenceCount(BigDecimal recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
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