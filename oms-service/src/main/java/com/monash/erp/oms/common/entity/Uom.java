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
public class Uom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uomId;

    private String uomTypeId;

    private String abbreviation;

    private BigDecimal numericCode;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setUomTypeId(String uomTypeId) {
        this.uomTypeId = uomTypeId;
    }
public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
public void setNumericCode(BigDecimal numericCode) {
        this.numericCode = numericCode;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
