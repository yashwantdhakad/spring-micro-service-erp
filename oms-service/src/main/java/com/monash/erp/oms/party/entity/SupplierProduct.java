package com.monash.erp.oms.party.entity;

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
public class SupplierProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String partyId;
    private LocalDateTime availableFromDate;
    private LocalDateTime availableThruDate;
    private String supplierPrefOrderId;
    private String supplierRatingTypeId;
    private BigDecimal standardLeadTimeDays;
    private BigDecimal minimumOrderQuantity;
    private BigDecimal orderQtyIncrements;
    private BigDecimal unitsIncluded;
    private String quantityUomId;
    private String agreementId;
    private String agreementItemSeqId;
    private BigDecimal lastPrice;
    private String currencyUomId;
    private String supplierProductName;
    private String supplierProductId;
    private String canDropShip;
    private BigDecimal supplierCommissionPerc;
    private String comments;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String supplierQuantityUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setAvailableFromDate(LocalDateTime availableFromDate) {
        this.availableFromDate = availableFromDate;
    }
public void setAvailableThruDate(LocalDateTime availableThruDate) {
        this.availableThruDate = availableThruDate;
    }
public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
    }
public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }
public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }
public void setMinimumOrderQuantity(BigDecimal minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }
public void setOrderQtyIncrements(BigDecimal orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }
public void setUnitsIncluded(BigDecimal unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }
public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
    }
public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }
public void setCanDropShip(String canDropShip) {
        this.canDropShip = canDropShip;
    }
public void setSupplierCommissionPerc(BigDecimal supplierCommissionPerc) {
        this.supplierCommissionPerc = supplierCommissionPerc;
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
public void setSupplierQuantityUomId(String supplierQuantityUomId) {
        this.supplierQuantityUomId = supplierQuantityUomId;
    }

}
