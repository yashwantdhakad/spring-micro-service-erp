package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductSearchResultId() {
        return productSearchResultId;
    }

    public void setProductSearchResultId(String productSearchResultId) {
        this.productSearchResultId = productSearchResultId;
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

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}