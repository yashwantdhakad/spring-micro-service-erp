package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CostComponentCalc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String costComponentCalcId;
    private String description;
    private String costGlAccountTypeId;
    private String offsettingGlAccountTypeId;
    private String fixedCost;
    private String variableCost;
    private String perMilliSecond;
    private String currencyUomId;
    private String costCustomMethodId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCostGlAccountTypeId() {
        return costGlAccountTypeId;
    }

    public void setCostGlAccountTypeId(String costGlAccountTypeId) {
        this.costGlAccountTypeId = costGlAccountTypeId;
    }

    public String getOffsettingGlAccountTypeId() {
        return offsettingGlAccountTypeId;
    }

    public void setOffsettingGlAccountTypeId(String offsettingGlAccountTypeId) {
        this.offsettingGlAccountTypeId = offsettingGlAccountTypeId;
    }

    public String getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(String fixedCost) {
        this.fixedCost = fixedCost;
    }

    public String getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(String variableCost) {
        this.variableCost = variableCost;
    }

    public String getPerMilliSecond() {
        return perMilliSecond;
    }

    public void setPerMilliSecond(String perMilliSecond) {
        this.perMilliSecond = perMilliSecond;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getCostCustomMethodId() {
        return costCustomMethodId;
    }

    public void setCostCustomMethodId(String costCustomMethodId) {
        this.costCustomMethodId = costCustomMethodId;
    }

}