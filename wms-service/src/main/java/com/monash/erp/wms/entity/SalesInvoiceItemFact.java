package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class SalesInvoiceItemFact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;
    private String invoiceItemSeqId;
    private String orderId;
    private String invoiceDateDimId;
    private String productDimId;
    private String billToCustomerDimId;
    private String origCurrencyDimId;
    private BigDecimal quantity;
    private BigDecimal extGrossAmount;
    private BigDecimal extDiscountAmount;
    private BigDecimal extNetAmount;
    private BigDecimal extTaxAmount;
    private BigDecimal extManFixedCost;
    private BigDecimal extManVarCost;
    private BigDecimal extStorageCost;
    private BigDecimal extDistributionCost;
    private BigDecimal contributionAmount;
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

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceItemSeqId() {
        return invoiceItemSeqId;
    }

    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceDateDimId() {
        return invoiceDateDimId;
    }

    public void setInvoiceDateDimId(String invoiceDateDimId) {
        this.invoiceDateDimId = invoiceDateDimId;
    }

    public String getProductDimId() {
        return productDimId;
    }

    public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }

    public String getBillToCustomerDimId() {
        return billToCustomerDimId;
    }

    public void setBillToCustomerDimId(String billToCustomerDimId) {
        this.billToCustomerDimId = billToCustomerDimId;
    }

    public String getOrigCurrencyDimId() {
        return origCurrencyDimId;
    }

    public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getExtGrossAmount() {
        return extGrossAmount;
    }

    public void setExtGrossAmount(BigDecimal extGrossAmount) {
        this.extGrossAmount = extGrossAmount;
    }

    public BigDecimal getExtDiscountAmount() {
        return extDiscountAmount;
    }

    public void setExtDiscountAmount(BigDecimal extDiscountAmount) {
        this.extDiscountAmount = extDiscountAmount;
    }

    public BigDecimal getExtNetAmount() {
        return extNetAmount;
    }

    public void setExtNetAmount(BigDecimal extNetAmount) {
        this.extNetAmount = extNetAmount;
    }

    public BigDecimal getExtTaxAmount() {
        return extTaxAmount;
    }

    public void setExtTaxAmount(BigDecimal extTaxAmount) {
        this.extTaxAmount = extTaxAmount;
    }

    public BigDecimal getExtManFixedCost() {
        return extManFixedCost;
    }

    public void setExtManFixedCost(BigDecimal extManFixedCost) {
        this.extManFixedCost = extManFixedCost;
    }

    public BigDecimal getExtManVarCost() {
        return extManVarCost;
    }

    public void setExtManVarCost(BigDecimal extManVarCost) {
        this.extManVarCost = extManVarCost;
    }

    public BigDecimal getExtStorageCost() {
        return extStorageCost;
    }

    public void setExtStorageCost(BigDecimal extStorageCost) {
        this.extStorageCost = extStorageCost;
    }

    public BigDecimal getExtDistributionCost() {
        return extDistributionCost;
    }

    public void setExtDistributionCost(BigDecimal extDistributionCost) {
        this.extDistributionCost = extDistributionCost;
    }

    public BigDecimal getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(BigDecimal contributionAmount) {
        this.contributionAmount = contributionAmount;
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