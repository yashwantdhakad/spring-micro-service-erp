package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductFeatureApplDto {
    private Long id;
    private String productId;
    private String productFeatureId;
    private String productFeatureApplTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String sequenceNum;
    private String amount;
    private String recurringAmount;
    private String featureDescription;
    private String featureAbbrev;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProductFeatureApplTypeId() {
        return productFeatureApplTypeId;
    }

    public void setProductFeatureApplTypeId(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRecurringAmount() {
        return recurringAmount;
    }

    public void setRecurringAmount(String recurringAmount) {
        this.recurringAmount = recurringAmount;
    }

    public String getFeatureDescription() {
        return featureDescription;
    }

    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
    }

    public String getFeatureAbbrev() {
        return featureAbbrev;
    }

    public void setFeatureAbbrev(String featureAbbrev) {
        this.featureAbbrev = featureAbbrev;
    }
}
