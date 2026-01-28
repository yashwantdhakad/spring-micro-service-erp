package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public LocalDateTime getAvailableFromDate() {
        return availableFromDate;
    }

    public void setAvailableFromDate(LocalDateTime availableFromDate) {
        this.availableFromDate = availableFromDate;
    }

    public LocalDateTime getAvailableThruDate() {
        return availableThruDate;
    }

    public void setAvailableThruDate(LocalDateTime availableThruDate) {
        this.availableThruDate = availableThruDate;
    }

    public String getSupplierPrefOrderId() {
        return supplierPrefOrderId;
    }

    public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
    }

    public String getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }

    public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }

    public BigDecimal getStandardLeadTimeDays() {
        return standardLeadTimeDays;
    }

    public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }

    public BigDecimal getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(BigDecimal minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public BigDecimal getOrderQtyIncrements() {
        return orderQtyIncrements;
    }

    public void setOrderQtyIncrements(BigDecimal orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }

    public BigDecimal getUnitsIncluded() {
        return unitsIncluded;
    }

    public void setUnitsIncluded(BigDecimal unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getSupplierProductName() {
        return supplierProductName;
    }

    public void setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
    }

    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }

    public String getCanDropShip() {
        return canDropShip;
    }

    public void setCanDropShip(String canDropShip) {
        this.canDropShip = canDropShip;
    }

    public BigDecimal getSupplierCommissionPerc() {
        return supplierCommissionPerc;
    }

    public void setSupplierCommissionPerc(BigDecimal supplierCommissionPerc) {
        this.supplierCommissionPerc = supplierCommissionPerc;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public String getSupplierQuantityUomId() {
        return supplierQuantityUomId;
    }

    public void setSupplierQuantityUomId(String supplierQuantityUomId) {
        this.supplierQuantityUomId = supplierQuantityUomId;
    }

}