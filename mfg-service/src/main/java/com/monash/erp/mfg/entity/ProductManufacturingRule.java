package com.monash.erp.mfg.entity;

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
    private String quantity;
    private String description;
    private LocalDateTime thruDate;
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
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
