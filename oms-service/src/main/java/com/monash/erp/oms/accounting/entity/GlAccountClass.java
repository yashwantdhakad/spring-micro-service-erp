package com.monash.erp.oms.accounting.entity;

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
public class GlAccountClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountClassId;

    private String parentClassId;

    private String description;

    private Boolean isAssetClass;

    private BigDecimal sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setIsAssetClass(Boolean isAssetClass) {
        this.isAssetClass = isAssetClass;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}
