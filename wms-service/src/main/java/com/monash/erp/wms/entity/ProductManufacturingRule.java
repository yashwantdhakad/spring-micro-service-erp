package com.monash.erp.wms.entity;

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
public class ProductManufacturingRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleId;
    private String productId;
    private String productIdFor;
    private String productIdIn;
    private String ruleSeqId;
    private LocalDateTime fromDate;
    private String productIdInSubst;
    private String productFeature;
    private String ruleOperator;
    private BigDecimal quantity;
    private String description;
    private LocalDateTime thruDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductIdFor(String productIdFor) {
        this.productIdFor = productIdFor;
    }
public void setProductIdIn(String productIdIn) {
        this.productIdIn = productIdIn;
    }
public void setRuleSeqId(String ruleSeqId) {
        this.ruleSeqId = ruleSeqId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setProductIdInSubst(String productIdInSubst) {
        this.productIdInSubst = productIdInSubst;
    }
public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }
public void setRuleOperator(String ruleOperator) {
        this.ruleOperator = ruleOperator;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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
