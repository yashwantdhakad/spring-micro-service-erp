package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ProductKeywordResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productKeywordResultId;
    private String visitId;
    private String productCategoryId;
    private String searchString;
    private String intraKeywordOperator;
    private String anyPrefix;
    private String anySuffix;
    private String removeStems;
    private BigDecimal numResults;
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

    public String getProductKeywordResultId() {
        return productKeywordResultId;
    }

    public void setProductKeywordResultId(String productKeywordResultId) {
        this.productKeywordResultId = productKeywordResultId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getIntraKeywordOperator() {
        return intraKeywordOperator;
    }

    public void setIntraKeywordOperator(String intraKeywordOperator) {
        this.intraKeywordOperator = intraKeywordOperator;
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

    public BigDecimal getNumResults() {
        return numResults;
    }

    public void setNumResults(BigDecimal numResults) {
        this.numResults = numResults;
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