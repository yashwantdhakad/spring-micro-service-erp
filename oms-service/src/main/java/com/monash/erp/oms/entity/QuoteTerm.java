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
public class QuoteTerm extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String termTypeId;
    private String quoteId;
    private String quoteItemSeqId;
    private BigDecimal termValue;
    private String uomId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
