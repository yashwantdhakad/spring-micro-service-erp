package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class UomConversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uomId;

    private String uomIdTo;

    private BigDecimal conversionFactor;

    private String customMethodId;

    private BigDecimal decimalScale;

    private String roundingMode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getUomIdTo() {
        return uomIdTo;
    }

    public void setUomIdTo(String uomIdTo) {
        this.uomIdTo = uomIdTo;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public String getCustomMethodId() {
        return customMethodId;
    }

    public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }

    public BigDecimal getDecimalScale() {
        return decimalScale;
    }

    public void setDecimalScale(BigDecimal decimalScale) {
        this.decimalScale = decimalScale;
    }

    public String getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
    }
}
