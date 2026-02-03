package com.monash.erp.wms.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
public void setExceptionDateTimes(String exceptionDateTimes) {
        this.exceptionDateTimes = exceptionDateTimes;
    }
public void setRecurrenceDateTimes(String recurrenceDateTimes) {
        this.recurrenceDateTimes = recurrenceDateTimes;
    }
public void setExceptionRuleId(String exceptionRuleId) {
        this.exceptionRuleId = exceptionRuleId;
    }
public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }
public void setRecurrenceCount(BigDecimal recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
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
