package com.monash.erp.oms.common.entity;

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
public class UomConversionDated {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uomId;

    private String uomIdTo;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal conversionFactor;

    private String customMethodId;

    private BigDecimal decimalScale;

    private String roundingMode;

    private String purposeEnumId;
public void setId(Long id) {
        this.id = id;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setUomIdTo(String uomIdTo) {
        this.uomIdTo = uomIdTo;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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
public void setPurposeEnumId(String purposeEnumId) {
        this.purposeEnumId = purposeEnumId;
    }
}
