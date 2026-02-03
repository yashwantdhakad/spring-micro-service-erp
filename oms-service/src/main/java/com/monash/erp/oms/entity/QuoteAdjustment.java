package com.monash.erp.oms.entity;

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
public class QuoteAdjustment extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteAdjustmentId;
    private String quoteAdjustmentTypeId;
    private String quoteId;
    private String quoteItemSeqId;
    private String comments;
    private String description;
    private BigDecimal amount;
    private String productPromoId;
    private String productPromoRuleId;
    private String productPromoActionSeqId;
    private String productFeatureId;
    private String correspondingProductId;
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
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteAdjustmentId(String quoteAdjustmentId) {
        this.quoteAdjustmentId = quoteAdjustmentId;
    }
public void setQuoteAdjustmentTypeId(String quoteAdjustmentTypeId) {
        this.quoteAdjustmentTypeId = quoteAdjustmentTypeId;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }
public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setCorrespondingProductId(String correspondingProductId) {
        this.correspondingProductId = correspondingProductId;
    }
public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }
public void setSourcePercentage(BigDecimal sourcePercentage) {
        this.sourcePercentage = sourcePercentage;
    }
public void setCustomerReferenceId(String customerReferenceId) {
        this.customerReferenceId = customerReferenceId;
    }
public void setPrimaryGeoId(String primaryGeoId) {
        this.primaryGeoId = primaryGeoId;
    }
public void setSecondaryGeoId(String secondaryGeoId) {
        this.secondaryGeoId = secondaryGeoId;
    }
public void setExemptAmount(BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
public void setIncludeInTax(String includeInTax) {
        this.includeInTax = includeInTax;
    }
public void setIncludeInShipping(String includeInShipping) {
        this.includeInShipping = includeInShipping;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

}
