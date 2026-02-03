package com.monash.erp.wms.entity;

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
public class ProductSearchConstraint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productSearchResultId;
    private String constraintSeqId;
    private String constraintName;
    private String infoString;
    private String includeSubCategories;
    private String isAnd;
    private String anyPrefix;
    private String anySuffix;
    private String removeStems;
    private String lowValue;
    private String highValue;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductSearchResultId(String productSearchResultId) {
        this.productSearchResultId = productSearchResultId;
    }
public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId;
    }
public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }
public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
public void setIncludeSubCategories(String includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }
public void setIsAnd(String isAnd) {
        this.isAnd = isAnd;
    }
public void setAnyPrefix(String anyPrefix) {
        this.anyPrefix = anyPrefix;
    }
public void setAnySuffix(String anySuffix) {
        this.anySuffix = anySuffix;
    }
public void setRemoveStems(String removeStems) {
        this.removeStems = removeStems;
    }
public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }
public void setHighValue(String highValue) {
        this.highValue = highValue;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
