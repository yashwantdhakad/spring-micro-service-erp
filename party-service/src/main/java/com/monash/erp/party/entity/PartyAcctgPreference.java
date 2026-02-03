package com.monash.erp.party.entity;

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
public class PartyAcctgPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private BigDecimal fiscalYearStartMonth;
    private BigDecimal fiscalYearStartDay;
    private String taxFormId;
    private String cogsMethodId;
    private String baseCurrencyUomId;
    private String invoiceSequenceEnumId;
    private String invoiceIdPrefix;
    private BigDecimal lastInvoiceNumber;
    private LocalDateTime lastInvoiceRestartDate;
    private String useInvoiceIdForReturns;
    private String quoteSequenceEnumId;
    private String quoteIdPrefix;
    private BigDecimal lastQuoteNumber;
    private String orderSequenceEnumId;
    private String orderIdPrefix;
    private BigDecimal lastOrderNumber;
    private String refundPaymentMethodId;
    private String errorGlJournalId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String purchaseOrderIdPrefix;
    private BigDecimal lastPurchaseOrderNumber;
    private String purchaseInvoiceIdPrefix;
    private BigDecimal lastPurchaseInvoiceNumber;
    private String inventoryItemIdPrefix;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setFiscalYearStartMonth(BigDecimal fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }
public void setFiscalYearStartDay(BigDecimal fiscalYearStartDay) {
        this.fiscalYearStartDay = fiscalYearStartDay;
    }
public void setTaxFormId(String taxFormId) {
        this.taxFormId = taxFormId;
    }
public void setCogsMethodId(String cogsMethodId) {
        this.cogsMethodId = cogsMethodId;
    }
public void setBaseCurrencyUomId(String baseCurrencyUomId) {
        this.baseCurrencyUomId = baseCurrencyUomId;
    }
public void setInvoiceSequenceEnumId(String invoiceSequenceEnumId) {
        this.invoiceSequenceEnumId = invoiceSequenceEnumId;
    }
public void setInvoiceIdPrefix(String invoiceIdPrefix) {
        this.invoiceIdPrefix = invoiceIdPrefix;
    }
public void setLastInvoiceNumber(BigDecimal lastInvoiceNumber) {
        this.lastInvoiceNumber = lastInvoiceNumber;
    }
public void setLastInvoiceRestartDate(LocalDateTime lastInvoiceRestartDate) {
        this.lastInvoiceRestartDate = lastInvoiceRestartDate;
    }
public void setUseInvoiceIdForReturns(String useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }
public void setQuoteSequenceEnumId(String quoteSequenceEnumId) {
        this.quoteSequenceEnumId = quoteSequenceEnumId;
    }
public void setQuoteIdPrefix(String quoteIdPrefix) {
        this.quoteIdPrefix = quoteIdPrefix;
    }
public void setLastQuoteNumber(BigDecimal lastQuoteNumber) {
        this.lastQuoteNumber = lastQuoteNumber;
    }
public void setOrderSequenceEnumId(String orderSequenceEnumId) {
        this.orderSequenceEnumId = orderSequenceEnumId;
    }
public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
    }
public void setLastOrderNumber(BigDecimal lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
    }
public void setRefundPaymentMethodId(String refundPaymentMethodId) {
        this.refundPaymentMethodId = refundPaymentMethodId;
    }
public void setErrorGlJournalId(String errorGlJournalId) {
        this.errorGlJournalId = errorGlJournalId;
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
public void setPurchaseOrderIdPrefix(String purchaseOrderIdPrefix) {
        this.purchaseOrderIdPrefix = purchaseOrderIdPrefix;
    }
public void setLastPurchaseOrderNumber(BigDecimal lastPurchaseOrderNumber) {
        this.lastPurchaseOrderNumber = lastPurchaseOrderNumber;
    }
public void setPurchaseInvoiceIdPrefix(String purchaseInvoiceIdPrefix) {
        this.purchaseInvoiceIdPrefix = purchaseInvoiceIdPrefix;
    }
public void setLastPurchaseInvoiceNumber(BigDecimal lastPurchaseInvoiceNumber) {
        this.lastPurchaseInvoiceNumber = lastPurchaseInvoiceNumber;
    }
public void setInventoryItemIdPrefix(String inventoryItemIdPrefix) {
        this.inventoryItemIdPrefix = inventoryItemIdPrefix;
    }

}
