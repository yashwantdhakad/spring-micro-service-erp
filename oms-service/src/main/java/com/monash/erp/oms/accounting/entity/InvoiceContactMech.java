package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class InvoiceContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;

    private String contactMechPurposeTypeId;

    private String contactMechId;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
}
