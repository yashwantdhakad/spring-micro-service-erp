package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setCostGlAccountTypeId(String costGlAccountTypeId) {
        this.costGlAccountTypeId = costGlAccountTypeId;
    }
public void setOffsettingGlAccountTypeId(String offsettingGlAccountTypeId) {
        this.offsettingGlAccountTypeId = offsettingGlAccountTypeId;
    }
public void setFixedCost(String fixedCost) {
        this.fixedCost = fixedCost;
    }
public void setVariableCost(String variableCost) {
        this.variableCost = variableCost;
    }
public void setPerMilliSecond(String perMilliSecond) {
        this.perMilliSecond = perMilliSecond;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setCostCustomMethodId(String costCustomMethodId) {
        this.costCustomMethodId = costCustomMethodId;
    }

}
