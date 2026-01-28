package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public BigDecimal getFiscalYearStartMonth() {
        return fiscalYearStartMonth;
    }

    public void setFiscalYearStartMonth(BigDecimal fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }

    public BigDecimal getFiscalYearStartDay() {
        return fiscalYearStartDay;
    }

    public void setFiscalYearStartDay(BigDecimal fiscalYearStartDay) {
        this.fiscalYearStartDay = fiscalYearStartDay;
    }

    public String getTaxFormId() {
        return taxFormId;
    }

    public void setTaxFormId(String taxFormId) {
        this.taxFormId = taxFormId;
    }

    public String getCogsMethodId() {
        return cogsMethodId;
    }

    public void setCogsMethodId(String cogsMethodId) {
        this.cogsMethodId = cogsMethodId;
    }

    public String getBaseCurrencyUomId() {
        return baseCurrencyUomId;
    }

    public void setBaseCurrencyUomId(String baseCurrencyUomId) {
        this.baseCurrencyUomId = baseCurrencyUomId;
    }

    public String getInvoiceSequenceEnumId() {
        return invoiceSequenceEnumId;
    }

    public void setInvoiceSequenceEnumId(String invoiceSequenceEnumId) {
        this.invoiceSequenceEnumId = invoiceSequenceEnumId;
    }

    public String getInvoiceIdPrefix() {
        return invoiceIdPrefix;
    }

    public void setInvoiceIdPrefix(String invoiceIdPrefix) {
        this.invoiceIdPrefix = invoiceIdPrefix;
    }

    public BigDecimal getLastInvoiceNumber() {
        return lastInvoiceNumber;
    }

    public void setLastInvoiceNumber(BigDecimal lastInvoiceNumber) {
        this.lastInvoiceNumber = lastInvoiceNumber;
    }

    public LocalDateTime getLastInvoiceRestartDate() {
        return lastInvoiceRestartDate;
    }

    public void setLastInvoiceRestartDate(LocalDateTime lastInvoiceRestartDate) {
        this.lastInvoiceRestartDate = lastInvoiceRestartDate;
    }

    public String getUseInvoiceIdForReturns() {
        return useInvoiceIdForReturns;
    }

    public void setUseInvoiceIdForReturns(String useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }

    public String getQuoteSequenceEnumId() {
        return quoteSequenceEnumId;
    }

    public void setQuoteSequenceEnumId(String quoteSequenceEnumId) {
        this.quoteSequenceEnumId = quoteSequenceEnumId;
    }

    public String getQuoteIdPrefix() {
        return quoteIdPrefix;
    }

    public void setQuoteIdPrefix(String quoteIdPrefix) {
        this.quoteIdPrefix = quoteIdPrefix;
    }

    public BigDecimal getLastQuoteNumber() {
        return lastQuoteNumber;
    }

    public void setLastQuoteNumber(BigDecimal lastQuoteNumber) {
        this.lastQuoteNumber = lastQuoteNumber;
    }

    public String getOrderSequenceEnumId() {
        return orderSequenceEnumId;
    }

    public void setOrderSequenceEnumId(String orderSequenceEnumId) {
        this.orderSequenceEnumId = orderSequenceEnumId;
    }

    public String getOrderIdPrefix() {
        return orderIdPrefix;
    }

    public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
    }

    public BigDecimal getLastOrderNumber() {
        return lastOrderNumber;
    }

    public void setLastOrderNumber(BigDecimal lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
    }

    public String getRefundPaymentMethodId() {
        return refundPaymentMethodId;
    }

    public void setRefundPaymentMethodId(String refundPaymentMethodId) {
        this.refundPaymentMethodId = refundPaymentMethodId;
    }

    public String getErrorGlJournalId() {
        return errorGlJournalId;
    }

    public void setErrorGlJournalId(String errorGlJournalId) {
        this.errorGlJournalId = errorGlJournalId;
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

    public String getPurchaseOrderIdPrefix() {
        return purchaseOrderIdPrefix;
    }

    public void setPurchaseOrderIdPrefix(String purchaseOrderIdPrefix) {
        this.purchaseOrderIdPrefix = purchaseOrderIdPrefix;
    }

    public BigDecimal getLastPurchaseOrderNumber() {
        return lastPurchaseOrderNumber;
    }

    public void setLastPurchaseOrderNumber(BigDecimal lastPurchaseOrderNumber) {
        this.lastPurchaseOrderNumber = lastPurchaseOrderNumber;
    }

    public String getPurchaseInvoiceIdPrefix() {
        return purchaseInvoiceIdPrefix;
    }

    public void setPurchaseInvoiceIdPrefix(String purchaseInvoiceIdPrefix) {
        this.purchaseInvoiceIdPrefix = purchaseInvoiceIdPrefix;
    }

    public BigDecimal getLastPurchaseInvoiceNumber() {
        return lastPurchaseInvoiceNumber;
    }

    public void setLastPurchaseInvoiceNumber(BigDecimal lastPurchaseInvoiceNumber) {
        this.lastPurchaseInvoiceNumber = lastPurchaseInvoiceNumber;
    }

    public String getInventoryItemIdPrefix() {
        return inventoryItemIdPrefix;
    }

    public void setInventoryItemIdPrefix(String inventoryItemIdPrefix) {
        this.inventoryItemIdPrefix = inventoryItemIdPrefix;
    }

}