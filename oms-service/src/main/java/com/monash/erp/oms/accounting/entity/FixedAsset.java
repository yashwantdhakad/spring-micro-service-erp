package com.monash.erp.oms.accounting.entity;

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
public class FixedAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String fixedAssetTypeId;

    private String parentFixedAssetId;

    private String instanceOfProductId;

    private String classEnumId;

    private String partyId;

    private String roleTypeId;

    private String fixedAssetName;

    private String acquireOrderId;

    private String acquireOrderItemSeqId;

    private LocalDateTime dateAcquired;

    private LocalDateTime dateLastServiced;

    private LocalDateTime dateNextService;

    private LocalDate expectedEndOfLife;

    private LocalDate actualEndOfLife;

    private BigDecimal productionCapacity;

    private String uomId;

    private String calendarId;

    private String serialNumber;

    private String locatedAtFacilityId;

    private String locatedAtLocationSeqId;

    private BigDecimal salvageValue;

    private BigDecimal depreciation;

    private BigDecimal purchaseCost;

    private String purchaseCostUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setFixedAssetTypeId(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }
public void setParentFixedAssetId(String parentFixedAssetId) {
        this.parentFixedAssetId = parentFixedAssetId;
    }
public void setInstanceOfProductId(String instanceOfProductId) {
        this.instanceOfProductId = instanceOfProductId;
    }
public void setClassEnumId(String classEnumId) {
        this.classEnumId = classEnumId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setFixedAssetName(String fixedAssetName) {
        this.fixedAssetName = fixedAssetName;
    }
public void setAcquireOrderId(String acquireOrderId) {
        this.acquireOrderId = acquireOrderId;
    }
public void setAcquireOrderItemSeqId(String acquireOrderItemSeqId) {
        this.acquireOrderItemSeqId = acquireOrderItemSeqId;
    }
public void setDateAcquired(LocalDateTime dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
public void setDateLastServiced(LocalDateTime dateLastServiced) {
        this.dateLastServiced = dateLastServiced;
    }
public void setDateNextService(LocalDateTime dateNextService) {
        this.dateNextService = dateNextService;
    }
public void setExpectedEndOfLife(LocalDate expectedEndOfLife) {
        this.expectedEndOfLife = expectedEndOfLife;
    }
public void setActualEndOfLife(LocalDate actualEndOfLife) {
        this.actualEndOfLife = actualEndOfLife;
    }
public void setProductionCapacity(BigDecimal productionCapacity) {
        this.productionCapacity = productionCapacity;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }
public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
public void setLocatedAtFacilityId(String locatedAtFacilityId) {
        this.locatedAtFacilityId = locatedAtFacilityId;
    }
public void setLocatedAtLocationSeqId(String locatedAtLocationSeqId) {
        this.locatedAtLocationSeqId = locatedAtLocationSeqId;
    }
public void setSalvageValue(BigDecimal salvageValue) {
        this.salvageValue = salvageValue;
    }
public void setDepreciation(BigDecimal depreciation) {
        this.depreciation = depreciation;
    }
public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
public void setPurchaseCostUomId(String purchaseCostUomId) {
        this.purchaseCostUomId = purchaseCostUomId;
    }
}
