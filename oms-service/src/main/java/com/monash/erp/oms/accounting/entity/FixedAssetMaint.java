package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class FixedAssetMaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String maintHistSeqId;

    private String statusId;

    private String productMaintTypeId;

    private String productMaintSeqId;

    private String scheduleWorkEffortId;

    private BigDecimal intervalQuantity;

    private String intervalUomId;

    private String intervalMeterTypeId;

    private String purchaseOrderId;

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

    public String getMaintHistSeqId() {
        return maintHistSeqId;
    }

    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }

    public String getProductMaintSeqId() {
        return productMaintSeqId;
    }

    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }

    public String getScheduleWorkEffortId() {
        return scheduleWorkEffortId;
    }

    public void setScheduleWorkEffortId(String scheduleWorkEffortId) {
        this.scheduleWorkEffortId = scheduleWorkEffortId;
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

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
