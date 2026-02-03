package com.monash.erp.oms.common.entity;

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
public class CustomTimePeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customTimePeriodId;

    private String parentPeriodId;

    private String periodTypeId;

    private BigDecimal periodNum;

    private String periodName;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private Boolean isClosed;
public void setId(Long id) {
        this.id = id;
    }
public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }
public void setParentPeriodId(String parentPeriodId) {
        this.parentPeriodId = parentPeriodId;
    }
public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
public void setPeriodNum(BigDecimal periodNum) {
        this.periodNum = periodNum;
    }
public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }
}
