package com.monash.erp.wms.entity;

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
public class ProductPriceCond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productPriceRuleId;
    private String productPriceCondSeqId;
    private String inputParamEnumId;
    private String operatorEnumId;
    private String condValue;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }
public void setProductPriceCondSeqId(String productPriceCondSeqId) {
        this.productPriceCondSeqId = productPriceCondSeqId;
    }
public void setInputParamEnumId(String inputParamEnumId) {
        this.inputParamEnumId = inputParamEnumId;
    }
public void setOperatorEnumId(String operatorEnumId) {
        this.operatorEnumId = operatorEnumId;
    }
public void setCondValue(String condValue) {
        this.condValue = condValue;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
