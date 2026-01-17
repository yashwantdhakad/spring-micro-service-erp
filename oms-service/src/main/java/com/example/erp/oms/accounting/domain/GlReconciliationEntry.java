package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class GlReconciliationEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glReconciliationId;

    private String acctgTransId;

    private String acctgTransEntrySeqId;

    private BigDecimal reconciledAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlReconciliationId() {
        return glReconciliationId;
    }

    public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }

    public String getAcctgTransId() {
        return acctgTransId;
    }

    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getAcctgTransEntrySeqId() {
        return acctgTransEntrySeqId;
    }

    public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }

    public BigDecimal getReconciledAmount() {
        return reconciledAmount;
    }

    public void setReconciledAmount(BigDecimal reconciledAmount) {
        this.reconciledAmount = reconciledAmount;
    }
}
