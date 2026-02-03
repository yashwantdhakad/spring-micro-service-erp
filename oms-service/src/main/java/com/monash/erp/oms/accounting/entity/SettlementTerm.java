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
public class SettlementTerm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String settlementTermId;

    private String termName;

    private BigDecimal termValue;

    private String uomId;
public void setId(Long id) {
        this.id = id;
    }
public void setSettlementTermId(String settlementTermId) {
        this.settlementTermId = settlementTermId;
    }
public void setTermName(String termName) {
        this.termName = termName;
    }
public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
}
