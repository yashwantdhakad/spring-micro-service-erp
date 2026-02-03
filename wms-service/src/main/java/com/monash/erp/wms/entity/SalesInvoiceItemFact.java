package com.monash.erp.wms.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setInvoiceDateDimId(String invoiceDateDimId) {
        this.invoiceDateDimId = invoiceDateDimId;
    }
public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }
public void setBillToCustomerDimId(String billToCustomerDimId) {
        this.billToCustomerDimId = billToCustomerDimId;
    }
public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setExtGrossAmount(BigDecimal extGrossAmount) {
        this.extGrossAmount = extGrossAmount;
    }
public void setExtDiscountAmount(BigDecimal extDiscountAmount) {
        this.extDiscountAmount = extDiscountAmount;
    }
public void setExtNetAmount(BigDecimal extNetAmount) {
        this.extNetAmount = extNetAmount;
    }
public void setExtTaxAmount(BigDecimal extTaxAmount) {
        this.extTaxAmount = extTaxAmount;
    }
public void setExtManFixedCost(BigDecimal extManFixedCost) {
        this.extManFixedCost = extManFixedCost;
    }
public void setExtManVarCost(BigDecimal extManVarCost) {
        this.extManVarCost = extManVarCost;
    }
public void setExtStorageCost(BigDecimal extStorageCost) {
        this.extStorageCost = extStorageCost;
    }
public void setExtDistributionCost(BigDecimal extDistributionCost) {
        this.extDistributionCost = extDistributionCost;
    }
public void setContributionAmount(BigDecimal contributionAmount) {
        this.contributionAmount = contributionAmount;
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

}
