package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public void setStandardLeadTimeDays(String standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }
public void setMinimumOrderQuantity(String minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }
public void setOrderQtyIncrements(String orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }
public void setUnitsIncluded(String unitsIncluded) {
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
public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }
public void setShippingPrice(String shippingPrice) {
        this.shippingPrice = shippingPrice;
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
public void setComments(String comments) {
        this.comments = comments;
    }

}
