package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class InvoiceItemAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String invoiceIdFrom;

    private String invoiceItemSeqIdFrom;

    private String invoiceIdTo;

    private String invoiceItemSeqIdTo;

    private String invoiceItemAssocTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String partyIdFrom;

    private String partyIdTo;

    private BigDecimal quantity;

    private BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceIdFrom() {
        return invoiceIdFrom;
    }

    public void setInvoiceIdFrom(String invoiceIdFrom) {
        this.invoiceIdFrom = invoiceIdFrom;
    }

    public String getInvoiceItemSeqIdFrom() {
        return invoiceItemSeqIdFrom;
    }

    public void setInvoiceItemSeqIdFrom(String invoiceItemSeqIdFrom) {
        this.invoiceItemSeqIdFrom = invoiceItemSeqIdFrom;
    }

    public String getInvoiceIdTo() {
        return invoiceIdTo;
    }

    public void setInvoiceIdTo(String invoiceIdTo) {
        this.invoiceIdTo = invoiceIdTo;
    }

    public String getInvoiceItemSeqIdTo() {
        return invoiceItemSeqIdTo;
    }

    public void setInvoiceItemSeqIdTo(String invoiceItemSeqIdTo) {
        this.invoiceItemSeqIdTo = invoiceItemSeqIdTo;
    }

    public String getInvoiceItemAssocTypeId() {
        return invoiceItemAssocTypeId;
    }

    public void setInvoiceItemAssocTypeId(String invoiceItemAssocTypeId) {
        this.invoiceItemAssocTypeId = invoiceItemAssocTypeId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
