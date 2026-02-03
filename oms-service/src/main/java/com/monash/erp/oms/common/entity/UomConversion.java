package com.monash.erp.oms.common.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setUomIdTo(String uomIdTo) {
        this.uomIdTo = uomIdTo;
    }
public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }
public void setDecimalScale(BigDecimal decimalScale) {
        this.decimalScale = decimalScale;
    }
public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
    }
}
