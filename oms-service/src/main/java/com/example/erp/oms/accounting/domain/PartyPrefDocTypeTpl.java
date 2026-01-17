package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PartyPrefDocTypeTpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyPrefDocTypeTplId;

    private String partyId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String invoiceTypeId;

    private String orderTypeId;

    private String quoteTypeId;

    private String customScreenId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartyPrefDocTypeTplId() {
        return partyPrefDocTypeTplId;
    }

    public void setPartyPrefDocTypeTplId(String partyPrefDocTypeTplId) {
        this.partyPrefDocTypeTplId = partyPrefDocTypeTplId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
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

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getQuoteTypeId() {
        return quoteTypeId;
    }

    public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }

    public String getCustomScreenId() {
        return customScreenId;
    }

    public void setCustomScreenId(String customScreenId) {
        this.customScreenId = customScreenId;
    }
}
