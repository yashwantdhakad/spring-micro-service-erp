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
public class PeriodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String periodTypeId;

    private String description;

    private BigDecimal periodLength;

    private String uomId;
public void setId(Long id) {
        this.id = id;
    }
public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setPeriodLength(BigDecimal periodLength) {
        this.periodLength = periodLength;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
}
