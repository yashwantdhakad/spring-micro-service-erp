package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "inventory_item",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_inventory_item_inventory_item_id", columnNames = "inventory_item_id")
        },
        indexes = {
                @Index(name = "idx_inventory_item_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_inventory_item_product_id", columnList = "product_id"),
                @Index(name = "idx_inventory_item_facility_id", columnList = "facility_id"),
                @Index(name = "idx_inventory_item_status_id", columnList = "status_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setDatetimeReceived(LocalDateTime datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }
public void setDatetimeManufactured(LocalDateTime datetimeManufactured) {
        this.datetimeManufactured = datetimeManufactured;
    }
public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setContainerId(String containerId) {
        this.containerId = containerId;
    }
public void setLotId(String lotId) {
        this.lotId = lotId;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setQuantityOnHandTotal(String quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }
public void setAvailableToPromiseTotal(String availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }
public void setAccountingQuantityTotal(String accountingQuantityTotal) {
        this.accountingQuantityTotal = accountingQuantityTotal;
    }
public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
public void setSoftIdentifier(String softIdentifier) {
        this.softIdentifier = softIdentifier;
    }
public void setActivationNumber(String activationNumber) {
        this.activationNumber = activationNumber;
    }
public void setActivationValidThru(String activationValidThru) {
        this.activationValidThru = activationValidThru;
    }
public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

}
