package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String inventoryItemTypeId;
    private String productId;
    private String partyId;
    private String ownerPartyId;
    private String statusId;
    private LocalDateTime datetimeReceived;
    private LocalDateTime datetimeManufactured;
    private LocalDateTime expireDate;
    private String facilityId;
    private String containerId;
    private String lotId;
    private String uomId;
    private String binNumber;
    private String locationSeqId;
    private String comments;
    private String quantityOnHandTotal;
    private String availableToPromiseTotal;
    private String accountingQuantityTotal;
    private String serialNumber;
    private String softIdentifier;
    private String activationNumber;
    private String activationValidThru;
    private String unitCost;
    private String currencyUomId;
    private String fixedAssetId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getDatetimeReceived() {
        return datetimeReceived;
    }

    public void setDatetimeReceived(LocalDateTime datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }

    public LocalDateTime getDatetimeManufactured() {
        return datetimeManufactured;
    }

    public void setDatetimeManufactured(LocalDateTime datetimeManufactured) {
        this.datetimeManufactured = datetimeManufactured;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getQuantityOnHandTotal() {
        return quantityOnHandTotal;
    }

    public void setQuantityOnHandTotal(String quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }

    public String getAvailableToPromiseTotal() {
        return availableToPromiseTotal;
    }

    public void setAvailableToPromiseTotal(String availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }

    public String getAccountingQuantityTotal() {
        return accountingQuantityTotal;
    }

    public void setAccountingQuantityTotal(String accountingQuantityTotal) {
        this.accountingQuantityTotal = accountingQuantityTotal;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSoftIdentifier() {
        return softIdentifier;
    }

    public void setSoftIdentifier(String softIdentifier) {
        this.softIdentifier = softIdentifier;
    }

    public String getActivationNumber() {
        return activationNumber;
    }

    public void setActivationNumber(String activationNumber) {
        this.activationNumber = activationNumber;
    }

    public String getActivationValidThru() {
        return activationValidThru;
    }

    public void setActivationValidThru(String activationValidThru) {
        this.activationValidThru = activationValidThru;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

}