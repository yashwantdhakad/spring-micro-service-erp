package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecurrenceRuleId() {
        return recurrenceRuleId;
    }

    public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public LocalDateTime getUntilDateTime() {
        return untilDateTime;
    }

    public void setUntilDateTime(LocalDateTime untilDateTime) {
        this.untilDateTime = untilDateTime;
    }

    public BigDecimal getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(BigDecimal countNumber) {
        this.countNumber = countNumber;
    }

    public BigDecimal getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(BigDecimal intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public String getBySecondList() {
        return bySecondList;
    }

    public void setBySecondList(String bySecondList) {
        this.bySecondList = bySecondList;
    }

    public String getByMinuteList() {
        return byMinuteList;
    }

    public void setByMinuteList(String byMinuteList) {
        this.byMinuteList = byMinuteList;
    }

    public String getByHourList() {
        return byHourList;
    }

    public void setByHourList(String byHourList) {
        this.byHourList = byHourList;
    }

    public String getByDayList() {
        return byDayList;
    }

    public void setByDayList(String byDayList) {
        this.byDayList = byDayList;
    }

    public String getByMonthDayList() {
        return byMonthDayList;
    }

    public void setByMonthDayList(String byMonthDayList) {
        this.byMonthDayList = byMonthDayList;
    }

    public String getByYearDayList() {
        return byYearDayList;
    }

    public void setByYearDayList(String byYearDayList) {
        this.byYearDayList = byYearDayList;
    }

    public String getByWeekNoList() {
        return byWeekNoList;
    }

    public void setByWeekNoList(String byWeekNoList) {
        this.byWeekNoList = byWeekNoList;
    }

    public String getByMonthList() {
        return byMonthList;
    }

    public void setByMonthList(String byMonthList) {
        this.byMonthList = byMonthList;
    }

    public String getBySetPosList() {
        return bySetPosList;
    }

    public void setBySetPosList(String bySetPosList) {
        this.bySetPosList = bySetPosList;
    }

    public String getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    public String getXName() {
        return xName;
    }

    public void setXName(String xName) {
        this.xName = xName;
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