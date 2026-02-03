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
public void setInvoiceSeqCustMethId(String invoiceSeqCustMethId) {
        this.invoiceSeqCustMethId = invoiceSeqCustMethId;
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
public void setUseInvoiceIdForReturns(Boolean useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }
public void setQuoteSeqCustMethId(String quoteSeqCustMethId) {
        this.quoteSeqCustMethId = quoteSeqCustMethId;
    }
public void setQuoteIdPrefix(String quoteIdPrefix) {
        this.quoteIdPrefix = quoteIdPrefix;
    }
public void setLastQuoteNumber(BigDecimal lastQuoteNumber) {
        this.lastQuoteNumber = lastQuoteNumber;
    }
public void setOrderSeqCustMethId(String orderSeqCustMethId) {
        this.orderSeqCustMethId = orderSeqCustMethId;
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
public void setEnableAccounting(Boolean enableAccounting) {
        this.enableAccounting = enableAccounting;
    }
}
