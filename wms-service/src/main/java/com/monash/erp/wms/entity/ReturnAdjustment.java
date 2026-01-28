package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ReturnAdjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String returnAdjustmentId;
    private String returnAdjustmentTypeId;
    private String returnId;
    private String returnItemSeqId;
    private String shipGroupSeqId;
    private String comments;
    private String description;
    private String returnTypeId;
    private String orderAdjustmentId;
    private BigDecimal amount;
    private String productPromoId;
    private String productPromoRuleId;
    private String productPromoActionSeqId;
    private String productFeatureId;
    private String correspondingProductId;
    private String taxAuthorityRateSeqId;
    private String sourceReferenceId;
    private BigDecimal sourcePercentage;
    private String customerReferenceId;
    private String primaryGeoId;
    private String secondaryGeoId;
    private BigDecimal exemptAmount;
    private String taxAuthGeoId;
    private String taxAuthPartyId;
    private String overrideGlAccountId;
    private String includeInTax;
    private String includeInShipping;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReturnAdjustmentId() {
        return returnAdjustmentId;
    }

    public void setReturnAdjustmentId(String returnAdjustmentId) {
        this.returnAdjustmentId = returnAdjustmentId;
    }

    public String getReturnAdjustmentTypeId() {
        return returnAdjustmentTypeId;
    }

    public void setReturnAdjustmentTypeId(String returnAdjustmentTypeId) {
        this.returnAdjustmentTypeId = returnAdjustmentTypeId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReturnTypeId() {
        return returnTypeId;
    }

    public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }

    public String getOrderAdjustmentId() {
        return orderAdjustmentId;
    }

    public void setOrderAdjustmentId(String orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public String getProductPromoRuleId() {
        return productPromoRuleId;
    }

    public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }

    public String getProductPromoActionSeqId() {
        return productPromoActionSeqId;
    }

    public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getCorrespondingProductId() {
        return correspondingProductId;
    }

    public void setCorrespondingProductId(String correspondingProductId) {
        this.correspondingProductId = correspondingProductId;
    }

    public String getTaxAuthorityRateSeqId() {
        return taxAuthorityRateSeqId;
    }

    public void setTaxAuthorityRateSeqId(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public BigDecimal getSourcePercentage() {
        return sourcePercentage;
    }

    public void setSourcePercentage(BigDecimal sourcePercentage) {
        this.sourcePercentage = sourcePercentage;
    }

    public String getCustomerReferenceId() {
        return customerReferenceId;
    }

    public void setCustomerReferenceId(String customerReferenceId) {
        this.customerReferenceId = customerReferenceId;
    }

    public String getPrimaryGeoId() {
        return primaryGeoId;
    }

    public void setPrimaryGeoId(String primaryGeoId) {
        this.primaryGeoId = primaryGeoId;
    }

    public String getSecondaryGeoId() {
        return secondaryGeoId;
    }

    public void setSecondaryGeoId(String secondaryGeoId) {
        this.secondaryGeoId = secondaryGeoId;
    }

    public BigDecimal getExemptAmount() {
        return exemptAmount;
    }

    public void setExemptAmount(BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
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

    public String getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public String getIncludeInTax() {
        return includeInTax;
    }

    public void setIncludeInTax(String includeInTax) {
        this.includeInTax = includeInTax;
    }

    public String getIncludeInShipping() {
        return includeInShipping;
    }

    public void setIncludeInShipping(String includeInShipping) {
        this.includeInShipping = includeInShipping;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
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

}