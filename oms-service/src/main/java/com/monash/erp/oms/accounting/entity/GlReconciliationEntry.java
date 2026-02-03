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
public class GlReconciliationEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glReconciliationId;

    private String acctgTransId;

    private String acctgTransEntrySeqId;

    private BigDecimal reconciledAmount;
public void setId(Long id) {
        this.id = id;
    }
public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }
public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }
public void setReconciledAmount(BigDecimal reconciledAmount) {
        this.reconciledAmount = reconciledAmount;
    }
}
