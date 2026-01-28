package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class DateDimension {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dimensionId;
    private LocalDate dateValue;
    private String description;
    private String dayName;
    private BigDecimal dayOfMonth;
    private BigDecimal dayOfYear;
    private String monthName;
    private BigDecimal monthOfYear;
    private BigDecimal yearName;
    private BigDecimal weekOfMonth;
    private BigDecimal weekOfYear;
    private String yearMonthDay;
    private String yearAndMonth;
    private String weekdayType;
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

    public String getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }

    public LocalDate getDateValue() {
        return dateValue;
    }

    public void setDateValue(LocalDate dateValue) {
        this.dateValue = dateValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public BigDecimal getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(BigDecimal dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public BigDecimal getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(BigDecimal dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public BigDecimal getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(BigDecimal monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public BigDecimal getYearName() {
        return yearName;
    }

    public void setYearName(BigDecimal yearName) {
        this.yearName = yearName;
    }

    public BigDecimal getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(BigDecimal weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public BigDecimal getWeekOfYear() {
        return weekOfYear;
    }

    public void setWeekOfYear(BigDecimal weekOfYear) {
        this.weekOfYear = weekOfYear;
    }

    public String getYearMonthDay() {
        return yearMonthDay;
    }

    public void setYearMonthDay(String yearMonthDay) {
        this.yearMonthDay = yearMonthDay;
    }

    public String getYearAndMonth() {
        return yearAndMonth;
    }

    public void setYearAndMonth(String yearAndMonth) {
        this.yearAndMonth = yearAndMonth;
    }

    public String getWeekdayType() {
        return weekdayType;
    }

    public void setWeekdayType(String weekdayType) {
        this.weekdayType = weekdayType;
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