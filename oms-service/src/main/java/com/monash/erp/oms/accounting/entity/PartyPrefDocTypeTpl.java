package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setPartyPrefDocTypeTplId(String partyPrefDocTypeTplId) {
        this.partyPrefDocTypeTplId = partyPrefDocTypeTplId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }
public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }
public void setCustomScreenId(String customScreenId) {
        this.customScreenId = customScreenId;
    }
}
