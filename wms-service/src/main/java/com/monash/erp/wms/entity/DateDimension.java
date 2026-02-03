package com.monash.erp.wms.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }
public void setDateValue(LocalDate dateValue) {
        this.dateValue = dateValue;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setDayName(String dayName) {
        this.dayName = dayName;
    }
public void setDayOfMonth(BigDecimal dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
public void setDayOfYear(BigDecimal dayOfYear) {
        this.dayOfYear = dayOfYear;
    }
public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
public void setMonthOfYear(BigDecimal monthOfYear) {
        this.monthOfYear = monthOfYear;
    }
public void setYearName(BigDecimal yearName) {
        this.yearName = yearName;
    }
public void setWeekOfMonth(BigDecimal weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }
public void setWeekOfYear(BigDecimal weekOfYear) {
        this.weekOfYear = weekOfYear;
    }
public void setYearMonthDay(String yearMonthDay) {
        this.yearMonthDay = yearMonthDay;
    }
public void setYearAndMonth(String yearAndMonth) {
        this.yearAndMonth = yearAndMonth;
    }
public void setWeekdayType(String weekdayType) {
        this.weekdayType = weekdayType;
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
