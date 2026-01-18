package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String standardLeadTimeDays;
    private String minimumOrderQuantity;
    private String orderQtyIncrements;
    private String unitsIncluded;
    private String quantityUomId;
    private String agreementId;
    private String agreementItemSeqId;
    private String lastPrice;
    private String shippingPrice;
    private String currencyUomId;
    private String supplierProductName;
    private String supplierProductId;
    private String canDropShip;
    private String comments;

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

    public String getStandardLeadTimeDays() {
        return standardLeadTimeDays;
    }

    public void setStandardLeadTimeDays(String standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }

    public String getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(String minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public String getOrderQtyIncrements() {
        return orderQtyIncrements;
    }

    public void setOrderQtyIncrements(String orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }

    public String getUnitsIncluded() {
        return unitsIncluded;
    }

    public void setUnitsIncluded(String unitsIncluded) {
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

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(String shippingPrice) {
        this.shippingPrice = shippingPrice;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}