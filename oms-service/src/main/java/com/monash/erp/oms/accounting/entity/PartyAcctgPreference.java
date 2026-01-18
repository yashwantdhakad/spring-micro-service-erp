package com.monash.erp.oms.accounting.entity;

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

    private String invoiceSeqCustMethId;

    private String invoiceIdPrefix;

    private BigDecimal lastInvoiceNumber;

    private LocalDateTime lastInvoiceRestartDate;

    private Boolean useInvoiceIdForReturns;

    private String quoteSeqCustMethId;

    private String quoteIdPrefix;

    private BigDecimal lastQuoteNumber;

    private String orderSeqCustMethId;

    private String orderIdPrefix;

    private BigDecimal lastOrderNumber;

    private String refundPaymentMethodId;

    private String errorGlJournalId;

    private Boolean enableAccounting;

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

    public String getInvoiceSeqCustMethId() {
        return invoiceSeqCustMethId;
    }

    public void setInvoiceSeqCustMethId(String invoiceSeqCustMethId) {
        this.invoiceSeqCustMethId = invoiceSeqCustMethId;
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

    public Boolean getUseInvoiceIdForReturns() {
        return useInvoiceIdForReturns;
    }

    public void setUseInvoiceIdForReturns(Boolean useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }

    public String getQuoteSeqCustMethId() {
        return quoteSeqCustMethId;
    }

    public void setQuoteSeqCustMethId(String quoteSeqCustMethId) {
        this.quoteSeqCustMethId = quoteSeqCustMethId;
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

    public String getOrderSeqCustMethId() {
        return orderSeqCustMethId;
    }

    public void setOrderSeqCustMethId(String orderSeqCustMethId) {
        this.orderSeqCustMethId = orderSeqCustMethId;
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

    public Boolean getEnableAccounting() {
        return enableAccounting;
    }

    public void setEnableAccounting(Boolean enableAccounting) {
        this.enableAccounting = enableAccounting;
    }
}
