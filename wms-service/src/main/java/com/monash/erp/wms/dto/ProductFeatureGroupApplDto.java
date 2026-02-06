package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductFeatureGroupApplDto {
    private Long id;
    private String productFeatureGroupId;
    private String productFeatureId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String sequenceNum;
    private ProductFeatureGroupSummary group;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
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

    public ProductFeatureGroupSummary getGroup() {
        return group;
    }

    public void setGroup(ProductFeatureGroupSummary group) {
        this.group = group;
    }
}
