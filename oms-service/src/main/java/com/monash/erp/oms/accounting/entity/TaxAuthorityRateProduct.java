package com.monash.erp.oms.accounting.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setTaxAuthorityRateSeqId(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setTaxAuthorityRateTypeId(String taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setTitleTransferEnumId(String titleTransferEnumId) {
        this.titleTransferEnumId = titleTransferEnumId;
    }
public void setMinItemPrice(BigDecimal minItemPrice) {
        this.minItemPrice = minItemPrice;
    }
public void setMinPurchase(BigDecimal minPurchase) {
        this.minPurchase = minPurchase;
    }
public void setTaxShipping(Boolean taxShipping) {
        this.taxShipping = taxShipping;
    }
public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
public void setTaxPromotions(Boolean taxPromotions) {
        this.taxPromotions = taxPromotions;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setIsTaxInShippingPrice(Boolean isTaxInShippingPrice) {
        this.isTaxInShippingPrice = isTaxInShippingPrice;
    }
}
