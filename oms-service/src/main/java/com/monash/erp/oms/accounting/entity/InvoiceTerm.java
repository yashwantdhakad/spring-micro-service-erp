package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class InvoiceTerm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceTermId;

    private String termTypeId;

    private String invoiceId;

    private String invoiceItemSeqId;

    private BigDecimal termValue;

    private BigDecimal termDays;

    private String textValue;

    private String description;

    private String uomId;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceTermId(String invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
    }
public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
public void setTermDays(BigDecimal termDays) {
        this.termDays = termDays;
    }
public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
}
