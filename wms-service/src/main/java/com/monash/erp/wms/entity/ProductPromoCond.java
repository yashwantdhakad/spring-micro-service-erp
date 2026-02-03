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
public class ProductPromoCond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productPromoId;
    private String productPromoRuleId;
    private String productPromoCondSeqId;
    private String inputParamEnumId;
    private String operatorEnumId;
    private String condValue;
    private String otherValue;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }
public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId;
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
public void setOtherValue(String otherValue) {
        this.otherValue = otherValue;
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
