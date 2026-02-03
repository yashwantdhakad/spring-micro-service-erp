package com.monash.erp.oms.entity;

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
public class AgreementTerm extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agreementTermId;
    private String termTypeId;
    private String agreementId;
    private String agreementItemSeqId;
    private String invoiceItemTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private BigDecimal termValue;
    private BigDecimal termDays;
    private String textValue;
    private BigDecimal minQuantity;
    private BigDecimal maxQuantity;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setAgreementTermId(String agreementTermId) {
        this.agreementTermId = agreementTermId;
    }
public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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
public void setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }
public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
