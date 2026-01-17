package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class SettlementTerm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String settlementTermId;

    private String termName;

    private BigDecimal termValue;

    private String uomId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSettlementTermId() {
        return settlementTermId;
    }

    public void setSettlementTermId(String settlementTermId) {
        this.settlementTermId = settlementTermId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public BigDecimal getTermValue() {
        return termValue;
    }

    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }
}
