package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Chemical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String physicalStateEnumId;
    private BigDecimal specificGravity;
    private BigDecimal hmisHealth;
    private BigDecimal hmisFlammability;
    private BigDecimal hmisReactivity;
    private String hmisPpe;
    private BigDecimal baseVoc;
    private BigDecimal mixVoc;
    private String msdsManufacture;
    private LocalDateTime msdsRevisedDate;
    private String encompsolEntry;
    private String wasteTypeEnumId;
    private String wasteProfileNumber;
    private String wasteComments;
    private BigDecimal reportQty;
    private String reportQtyUomId;
    private String tier2;
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

    public String getPhysicalStateEnumId() {
        return physicalStateEnumId;
    }

    public void setPhysicalStateEnumId(String physicalStateEnumId) {
        this.physicalStateEnumId = physicalStateEnumId;
    }

    public BigDecimal getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(BigDecimal specificGravity) {
        this.specificGravity = specificGravity;
    }

    public BigDecimal getHmisHealth() {
        return hmisHealth;
    }

    public void setHmisHealth(BigDecimal hmisHealth) {
        this.hmisHealth = hmisHealth;
    }

    public BigDecimal getHmisFlammability() {
        return hmisFlammability;
    }

    public void setHmisFlammability(BigDecimal hmisFlammability) {
        this.hmisFlammability = hmisFlammability;
    }

    public BigDecimal getHmisReactivity() {
        return hmisReactivity;
    }

    public void setHmisReactivity(BigDecimal hmisReactivity) {
        this.hmisReactivity = hmisReactivity;
    }

    public String getHmisPpe() {
        return hmisPpe;
    }

    public void setHmisPpe(String hmisPpe) {
        this.hmisPpe = hmisPpe;
    }

    public BigDecimal getBaseVoc() {
        return baseVoc;
    }

    public void setBaseVoc(BigDecimal baseVoc) {
        this.baseVoc = baseVoc;
    }

    public BigDecimal getMixVoc() {
        return mixVoc;
    }

    public void setMixVoc(BigDecimal mixVoc) {
        this.mixVoc = mixVoc;
    }

    public String getMsdsManufacture() {
        return msdsManufacture;
    }

    public void setMsdsManufacture(String msdsManufacture) {
        this.msdsManufacture = msdsManufacture;
    }

    public LocalDateTime getMsdsRevisedDate() {
        return msdsRevisedDate;
    }

    public void setMsdsRevisedDate(LocalDateTime msdsRevisedDate) {
        this.msdsRevisedDate = msdsRevisedDate;
    }

    public String getEncompsolEntry() {
        return encompsolEntry;
    }

    public void setEncompsolEntry(String encompsolEntry) {
        this.encompsolEntry = encompsolEntry;
    }

    public String getWasteTypeEnumId() {
        return wasteTypeEnumId;
    }

    public void setWasteTypeEnumId(String wasteTypeEnumId) {
        this.wasteTypeEnumId = wasteTypeEnumId;
    }

    public String getWasteProfileNumber() {
        return wasteProfileNumber;
    }

    public void setWasteProfileNumber(String wasteProfileNumber) {
        this.wasteProfileNumber = wasteProfileNumber;
    }

    public String getWasteComments() {
        return wasteComments;
    }

    public void setWasteComments(String wasteComments) {
        this.wasteComments = wasteComments;
    }

    public BigDecimal getReportQty() {
        return reportQty;
    }

    public void setReportQty(BigDecimal reportQty) {
        this.reportQty = reportQty;
    }

    public String getReportQtyUomId() {
        return reportQtyUomId;
    }

    public void setReportQtyUomId(String reportQtyUomId) {
        this.reportQtyUomId = reportQtyUomId;
    }

    public String getTier2() {
        return tier2;
    }

    public void setTier2(String tier2) {
        this.tier2 = tier2;
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