package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class TestFieldType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testFieldTypeId;
    private String blobField;
    private LocalDate dateField;
    private LocalTime timeField;
    private LocalDateTime dateTimeField;
    private BigDecimal fixedPointField;
    private BigDecimal floatingPointField;
    private BigDecimal numericField;
    private String clobField;
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

    public String getTestFieldTypeId() {
        return testFieldTypeId;
    }

    public void setTestFieldTypeId(String testFieldTypeId) {
        this.testFieldTypeId = testFieldTypeId;
    }

    public String getBlobField() {
        return blobField;
    }

    public void setBlobField(String blobField) {
        this.blobField = blobField;
    }

    public LocalDate getDateField() {
        return dateField;
    }

    public void setDateField(LocalDate dateField) {
        this.dateField = dateField;
    }

    public LocalTime getTimeField() {
        return timeField;
    }

    public void setTimeField(LocalTime timeField) {
        this.timeField = timeField;
    }

    public LocalDateTime getDateTimeField() {
        return dateTimeField;
    }

    public void setDateTimeField(LocalDateTime dateTimeField) {
        this.dateTimeField = dateTimeField;
    }

    public BigDecimal getFixedPointField() {
        return fixedPointField;
    }

    public void setFixedPointField(BigDecimal fixedPointField) {
        this.fixedPointField = fixedPointField;
    }

    public BigDecimal getFloatingPointField() {
        return floatingPointField;
    }

    public void setFloatingPointField(BigDecimal floatingPointField) {
        this.floatingPointField = floatingPointField;
    }

    public BigDecimal getNumericField() {
        return numericField;
    }

    public void setNumericField(BigDecimal numericField) {
        this.numericField = numericField;
    }

    public String getClobField() {
        return clobField;
    }

    public void setClobField(String clobField) {
        this.clobField = clobField;
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