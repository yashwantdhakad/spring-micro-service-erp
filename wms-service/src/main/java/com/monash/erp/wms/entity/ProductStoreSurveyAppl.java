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
public class ProductStoreSurveyAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreSurveyId;
    private String productStoreId;
    private String surveyApplTypeId;
    private String groupName;
    private String surveyId;
    private String productId;
    private String productCategoryId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String surveyTemplate;
    private String resultTemplate;
    private BigDecimal sequenceNum;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreSurveyId(String productStoreSurveyId) {
        this.productStoreSurveyId = productStoreSurveyId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setSurveyApplTypeId(String surveyApplTypeId) {
        this.surveyApplTypeId = surveyApplTypeId;
    }
public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSurveyTemplate(String surveyTemplate) {
        this.surveyTemplate = surveyTemplate;
    }
public void setResultTemplate(String resultTemplate) {
        this.resultTemplate = resultTemplate;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
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
