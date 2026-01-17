package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvoiceTermAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String invoiceTermId;

    private String attrName;

    private String attrValue;

    private String attrDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceTermId() {
        return invoiceTermId;
    }

    public void setInvoiceTermId(String invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getAttrDescription() {
        return attrDescription;
    }

    public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }
}
