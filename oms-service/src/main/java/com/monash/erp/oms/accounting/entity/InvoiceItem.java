package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;

    private String invoiceItemSeqId;

    private String invoiceItemTypeId;

    private String overrideGlAccountId;

    private String overrideOrgPartyId;

    private String inventoryItemId;

    private String productId;

    private String productFeatureId;

    private String parentInvoiceId;

    private String parentInvoiceItemSeqId;

    private String uomId;

    private Boolean taxableFlag;

    private BigDecimal quantity;

    private BigDecimal amount;

    private String description;

    private String taxAuthPartyId;

    private String taxAuthGeoId;

    private String taxAuthorityRateSeqId;

    private String salesOpportunityId;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }
public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
public void setOverrideOrgPartyId(String overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setParentInvoiceId(String parentInvoiceId) {
        this.parentInvoiceId = parentInvoiceId;
    }
public void setParentInvoiceItemSeqId(String parentInvoiceItemSeqId) {
        this.parentInvoiceItemSeqId = parentInvoiceItemSeqId;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setTaxableFlag(Boolean taxableFlag) {
        this.taxableFlag = taxableFlag;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthorityRateSeqId(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }
public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }
}
