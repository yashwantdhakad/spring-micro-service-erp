package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class FixedAssetMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String productMeterTypeId;

    private LocalDateTime readingDate;

    private BigDecimal meterValue;

    private String readingReasonEnumId;

    private String maintHistSeqId;

    private String workEffortId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getProductMeterTypeId() {
        return productMeterTypeId;
    }

    public void setProductMeterTypeId(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId;
    }

    public LocalDateTime getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(LocalDateTime readingDate) {
        this.readingDate = readingDate;
    }

    public BigDecimal getMeterValue() {
        return meterValue;
    }

    public void setMeterValue(BigDecimal meterValue) {
        this.meterValue = meterValue;
    }

    public String getReadingReasonEnumId() {
        return readingReasonEnumId;
    }

    public void setReadingReasonEnumId(String readingReasonEnumId) {
        this.readingReasonEnumId = readingReasonEnumId;
    }

    public String getMaintHistSeqId() {
        return maintHistSeqId;
    }

    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
}
