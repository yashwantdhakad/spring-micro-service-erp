package com.example.erp.mfg.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductIdFor() {
        return productIdFor;
    }

    public void setProductIdFor(String productIdFor) {
        this.productIdFor = productIdFor;
    }

    public String getProductIdIn() {
        return productIdIn;
    }

    public void setProductIdIn(String productIdIn) {
        this.productIdIn = productIdIn;
    }

    public String getRuleSeqId() {
        return ruleSeqId;
    }

    public void setRuleSeqId(String ruleSeqId) {
        this.ruleSeqId = ruleSeqId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public String getProductIdInSubst() {
        return productIdInSubst;
    }

    public void setProductIdInSubst(String productIdInSubst) {
        this.productIdInSubst = productIdInSubst;
    }

    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    public String getRuleOperator() {
        return ruleOperator;
    }

    public void setRuleOperator(String ruleOperator) {
        this.ruleOperator = ruleOperator;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}