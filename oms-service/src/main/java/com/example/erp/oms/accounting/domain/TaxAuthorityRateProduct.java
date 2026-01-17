package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class TaxAuthorityRateProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String taxAuthorityRateSeqId;

    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private String taxAuthorityRateTypeId;

    private String productStoreId;

    private String productCategoryId;

    private String titleTransferEnumId;

    private BigDecimal minItemPrice;

    private BigDecimal minPurchase;

    private Boolean taxShipping;

    private BigDecimal taxPercentage;

    private Boolean taxPromotions;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String description;

    private Boolean isTaxInShippingPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxAuthorityRateSeqId() {
        return taxAuthorityRateSeqId;
    }

    public void setTaxAuthorityRateSeqId(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }

    public String getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }

    public String getTaxAuthorityRateTypeId() {
        return taxAuthorityRateTypeId;
    }

    public void setTaxAuthorityRateTypeId(String taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getTitleTransferEnumId() {
        return titleTransferEnumId;
    }

    public void setTitleTransferEnumId(String titleTransferEnumId) {
        this.titleTransferEnumId = titleTransferEnumId;
    }

    public BigDecimal getMinItemPrice() {
        return minItemPrice;
    }

    public void setMinItemPrice(BigDecimal minItemPrice) {
        this.minItemPrice = minItemPrice;
    }

    public BigDecimal getMinPurchase() {
        return minPurchase;
    }

    public void setMinPurchase(BigDecimal minPurchase) {
        this.minPurchase = minPurchase;
    }

    public Boolean getTaxShipping() {
        return taxShipping;
    }

    public void setTaxShipping(Boolean taxShipping) {
        this.taxShipping = taxShipping;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Boolean getTaxPromotions() {
        return taxPromotions;
    }

    public void setTaxPromotions(Boolean taxPromotions) {
        this.taxPromotions = taxPromotions;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsTaxInShippingPrice() {
        return isTaxInShippingPrice;
    }

    public void setIsTaxInShippingPrice(Boolean isTaxInShippingPrice) {
        this.isTaxInShippingPrice = isTaxInShippingPrice;
    }
}
