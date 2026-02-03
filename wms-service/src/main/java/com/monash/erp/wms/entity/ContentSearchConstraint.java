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
public class ContentSearchConstraint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentSearchResultId;
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
public void setId(Long id) {
        this.id = id;
    }
public void setContentSearchResultId(String contentSearchResultId) {
        this.contentSearchResultId = contentSearchResultId;
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

}
