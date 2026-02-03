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
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceIdFrom(String invoiceIdFrom) {
        this.invoiceIdFrom = invoiceIdFrom;
    }
public void setInvoiceItemSeqIdFrom(String invoiceItemSeqIdFrom) {
        this.invoiceItemSeqIdFrom = invoiceItemSeqIdFrom;
    }
public void setInvoiceIdTo(String invoiceIdTo) {
        this.invoiceIdTo = invoiceIdTo;
    }
public void setInvoiceItemSeqIdTo(String invoiceItemSeqIdTo) {
        this.invoiceItemSeqIdTo = invoiceItemSeqIdTo;
    }
public void setInvoiceItemAssocTypeId(String invoiceItemAssocTypeId) {
        this.invoiceItemAssocTypeId = invoiceItemAssocTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
