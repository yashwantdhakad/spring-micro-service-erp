package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
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

    public String getFixedAssetTypeId() {
        return fixedAssetTypeId;
    }

    public void setFixedAssetTypeId(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }

    public String getParentFixedAssetId() {
        return parentFixedAssetId;
    }

    public void setParentFixedAssetId(String parentFixedAssetId) {
        this.parentFixedAssetId = parentFixedAssetId;
    }

    public String getInstanceOfProductId() {
        return instanceOfProductId;
    }

    public void setInstanceOfProductId(String instanceOfProductId) {
        this.instanceOfProductId = instanceOfProductId;
    }

    public String getClassEnumId() {
        return classEnumId;
    }

    public void setClassEnumId(String classEnumId) {
        this.classEnumId = classEnumId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getFixedAssetName() {
        return fixedAssetName;
    }

    public void setFixedAssetName(String fixedAssetName) {
        this.fixedAssetName = fixedAssetName;
    }

    public String getAcquireOrderId() {
        return acquireOrderId;
    }

    public void setAcquireOrderId(String acquireOrderId) {
        this.acquireOrderId = acquireOrderId;
    }

    public String getAcquireOrderItemSeqId() {
        return acquireOrderItemSeqId;
    }

    public void setAcquireOrderItemSeqId(String acquireOrderItemSeqId) {
        this.acquireOrderItemSeqId = acquireOrderItemSeqId;
    }

    public LocalDateTime getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDateTime dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public LocalDateTime getDateLastServiced() {
        return dateLastServiced;
    }

    public void setDateLastServiced(LocalDateTime dateLastServiced) {
        this.dateLastServiced = dateLastServiced;
    }

    public LocalDateTime getDateNextService() {
        return dateNextService;
    }

    public void setDateNextService(LocalDateTime dateNextService) {
        this.dateNextService = dateNextService;
    }

    public LocalDate getExpectedEndOfLife() {
        return expectedEndOfLife;
    }

    public void setExpectedEndOfLife(LocalDate expectedEndOfLife) {
        this.expectedEndOfLife = expectedEndOfLife;
    }

    public LocalDate getActualEndOfLife() {
        return actualEndOfLife;
    }

    public void setActualEndOfLife(LocalDate actualEndOfLife) {
        this.actualEndOfLife = actualEndOfLife;
    }

    public BigDecimal getProductionCapacity() {
        return productionCapacity;
    }

    public void setProductionCapacity(BigDecimal productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLocatedAtFacilityId() {
        return locatedAtFacilityId;
    }

    public void setLocatedAtFacilityId(String locatedAtFacilityId) {
        this.locatedAtFacilityId = locatedAtFacilityId;
    }

    public String getLocatedAtLocationSeqId() {
        return locatedAtLocationSeqId;
    }

    public void setLocatedAtLocationSeqId(String locatedAtLocationSeqId) {
        this.locatedAtLocationSeqId = locatedAtLocationSeqId;
    }

    public BigDecimal getSalvageValue() {
        return salvageValue;
    }

    public void setSalvageValue(BigDecimal salvageValue) {
        this.salvageValue = salvageValue;
    }

    public BigDecimal getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(BigDecimal depreciation) {
        this.depreciation = depreciation;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getPurchaseCostUomId() {
        return purchaseCostUomId;
    }

    public void setPurchaseCostUomId(String purchaseCostUomId) {
        this.purchaseCostUomId = purchaseCostUomId;
    }
}
