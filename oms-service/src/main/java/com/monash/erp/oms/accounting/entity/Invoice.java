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
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;

    private String invoiceTypeId;

    private String partyIdFrom;

    private String partyId;

    private String roleTypeId;

    private String statusId;

    private String billingAccountId;

    private String contactMechId;

    private LocalDateTime invoiceDate;

    private LocalDateTime dueDate;

    private LocalDateTime paidDate;

    private String invoiceMessage;

    private String referenceNumber;

    private String description;

    private String currencyUomId;

    private String recurrenceInfoId;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }
public void setInvoiceMessage(String invoiceMessage) {
        this.invoiceMessage = invoiceMessage;
    }
public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
}
