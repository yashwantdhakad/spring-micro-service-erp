package com.monash.erp.wms.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setProductKeywordResultId(String productKeywordResultId) {
        this.productKeywordResultId = productKeywordResultId;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
public void setIntraKeywordOperator(String intraKeywordOperator) {
        this.intraKeywordOperator = intraKeywordOperator;
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
public void setNumResults(BigDecimal numResults) {
        this.numResults = numResults;
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
