package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentSearchResultId() {
        return contentSearchResultId;
    }

    public void setContentSearchResultId(String contentSearchResultId) {
        this.contentSearchResultId = contentSearchResultId;
    }

    public String getConstraintSeqId() {
        return constraintSeqId;
    }

    public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }

    public String getIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(String includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }

    public String getIsAnd() {
        return isAnd;
    }

    public void setIsAnd(String isAnd) {
        this.isAnd = isAnd;
    }

    public String getAnyPrefix() {
        return anyPrefix;
    }

    public void setAnyPrefix(String anyPrefix) {
        this.anyPrefix = anyPrefix;
    }

    public String getAnySuffix() {
        return anySuffix;
    }

    public void setAnySuffix(String anySuffix) {
        this.anySuffix = anySuffix;
    }

    public String getRemoveStems() {
        return removeStems;
    }

    public void setRemoveStems(String removeStems) {
        this.removeStems = removeStems;
    }

    public String getLowValue() {
        return lowValue;
    }

    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }

    public String getHighValue() {
        return highValue;
    }

    public void setHighValue(String highValue) {
        this.highValue = highValue;
    }

}