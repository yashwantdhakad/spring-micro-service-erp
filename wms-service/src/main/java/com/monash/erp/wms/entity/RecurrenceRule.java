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
public class RecurrenceRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recurrenceRuleId;
    private String frequency;
    private LocalDateTime untilDateTime;
    private BigDecimal countNumber;
    private BigDecimal intervalNumber;
    private String bySecondList;
    private String byMinuteList;
    private String byHourList;
    private String byDayList;
    private String byMonthDayList;
    private String byYearDayList;
    private String byWeekNoList;
    private String byMonthList;
    private String bySetPosList;
    private String weekStart;
    private String xName;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }
public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
public void setUntilDateTime(LocalDateTime untilDateTime) {
        this.untilDateTime = untilDateTime;
    }
public void setCountNumber(BigDecimal countNumber) {
        this.countNumber = countNumber;
    }
public void setIntervalNumber(BigDecimal intervalNumber) {
        this.intervalNumber = intervalNumber;
    }
public void setBySecondList(String bySecondList) {
        this.bySecondList = bySecondList;
    }
public void setByMinuteList(String byMinuteList) {
        this.byMinuteList = byMinuteList;
    }
public void setByHourList(String byHourList) {
        this.byHourList = byHourList;
    }
public void setByDayList(String byDayList) {
        this.byDayList = byDayList;
    }
public void setByMonthDayList(String byMonthDayList) {
        this.byMonthDayList = byMonthDayList;
    }
public void setByYearDayList(String byYearDayList) {
        this.byYearDayList = byYearDayList;
    }
public void setByWeekNoList(String byWeekNoList) {
        this.byWeekNoList = byWeekNoList;
    }
public void setByMonthList(String byMonthList) {
        this.byMonthList = byMonthList;
    }
public void setBySetPosList(String bySetPosList) {
        this.bySetPosList = bySetPosList;
    }
public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }
public void setXName(String xName) {
        this.xName = xName;
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
