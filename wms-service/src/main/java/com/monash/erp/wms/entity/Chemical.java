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
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setPhysicalStateEnumId(String physicalStateEnumId) {
        this.physicalStateEnumId = physicalStateEnumId;
    }
public void setSpecificGravity(BigDecimal specificGravity) {
        this.specificGravity = specificGravity;
    }
public void setHmisHealth(BigDecimal hmisHealth) {
        this.hmisHealth = hmisHealth;
    }
public void setHmisFlammability(BigDecimal hmisFlammability) {
        this.hmisFlammability = hmisFlammability;
    }
public void setHmisReactivity(BigDecimal hmisReactivity) {
        this.hmisReactivity = hmisReactivity;
    }
public void setHmisPpe(String hmisPpe) {
        this.hmisPpe = hmisPpe;
    }
public void setBaseVoc(BigDecimal baseVoc) {
        this.baseVoc = baseVoc;
    }
public void setMixVoc(BigDecimal mixVoc) {
        this.mixVoc = mixVoc;
    }
public void setMsdsManufacture(String msdsManufacture) {
        this.msdsManufacture = msdsManufacture;
    }
public void setMsdsRevisedDate(LocalDateTime msdsRevisedDate) {
        this.msdsRevisedDate = msdsRevisedDate;
    }
public void setEncompsolEntry(String encompsolEntry) {
        this.encompsolEntry = encompsolEntry;
    }
public void setWasteTypeEnumId(String wasteTypeEnumId) {
        this.wasteTypeEnumId = wasteTypeEnumId;
    }
public void setWasteProfileNumber(String wasteProfileNumber) {
        this.wasteProfileNumber = wasteProfileNumber;
    }
public void setWasteComments(String wasteComments) {
        this.wasteComments = wasteComments;
    }
public void setReportQty(BigDecimal reportQty) {
        this.reportQty = reportQty;
    }
public void setReportQtyUomId(String reportQtyUomId) {
        this.reportQtyUomId = reportQtyUomId;
    }
public void setTier2(String tier2) {
        this.tier2 = tier2;
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
