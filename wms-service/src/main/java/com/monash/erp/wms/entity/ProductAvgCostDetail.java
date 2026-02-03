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
public class ProductAvgCostDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productAverageCostId;
    private String organizationPartyId;
    private String productAverageCostTypeId;
    private String productId;
    private String facilityId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String basePartProductId;
    private BigDecimal averageCost;
    private BigDecimal unitCost;
    private BigDecimal standardCost;
    private BigDecimal affectedQuantity;
    private BigDecimal quantityOnHand;
    private BigDecimal basePartQuantityOnHand;
    private BigDecimal basePartAverageCost;
    private LocalDateTime effectiveDate;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String returnId;
    private String returnItemSeqId;
    private String workEffortId;
    private String fixedAssetId;
    private String maintHistSeqId;
    private String itemIssuanceId;
    private String receiptId;
    private String physicalInventoryId;
    private String inventoryTransferId;
    private String comments;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private BigDecimal sequenceNumber;
public void setId(Long id) {
        this.id = id;
    }
public void setProductAverageCostId(String productAverageCostId) {
        this.productAverageCostId = productAverageCostId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setProductAverageCostTypeId(String productAverageCostTypeId) {
        this.productAverageCostTypeId = productAverageCostTypeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setBasePartProductId(String basePartProductId) {
        this.basePartProductId = basePartProductId;
    }
public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }
public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }
public void setAffectedQuantity(BigDecimal affectedQuantity) {
        this.affectedQuantity = affectedQuantity;
    }
public void setQuantityOnHand(BigDecimal quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
public void setBasePartQuantityOnHand(BigDecimal basePartQuantityOnHand) {
        this.basePartQuantityOnHand = basePartQuantityOnHand;
    }
public void setBasePartAverageCost(BigDecimal basePartAverageCost) {
        this.basePartAverageCost = basePartAverageCost;
    }
public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
public void setInventoryTransferId(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId;
    }
public void setComments(String comments) {
        this.comments = comments;
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
public void setSequenceNumber(BigDecimal sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

}
