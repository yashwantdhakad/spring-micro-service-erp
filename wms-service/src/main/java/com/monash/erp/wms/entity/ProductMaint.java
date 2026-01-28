package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ProductMaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String productMaintSeqId;
    private String productMaintTypeId;
    private String maintName;
    private String maintTemplateWorkEffortId;
    private BigDecimal intervalQuantity;
    private String intervalUomId;
    private String intervalMeterTypeId;
    private BigDecimal repeatCount;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductMaintSeqId() {
        return productMaintSeqId;
    }

    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }

    public String getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }

    public String getMaintName() {
        return maintName;
    }

    public void setMaintName(String maintName) {
        this.maintName = maintName;
    }

    public String getMaintTemplateWorkEffortId() {
        return maintTemplateWorkEffortId;
    }

    public void setMaintTemplateWorkEffortId(String maintTemplateWorkEffortId) {
        this.maintTemplateWorkEffortId = maintTemplateWorkEffortId;
    }

    public BigDecimal getIntervalQuantity() {
        return intervalQuantity;
    }

    public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }

    public String getIntervalUomId() {
        return intervalUomId;
    }

    public void setIntervalUomId(String intervalUomId) {
        this.intervalUomId = intervalUomId;
    }

    public String getIntervalMeterTypeId() {
        return intervalMeterTypeId;
    }

    public void setIntervalMeterTypeId(String intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }

    public BigDecimal getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(BigDecimal repeatCount) {
        this.repeatCount = repeatCount;
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