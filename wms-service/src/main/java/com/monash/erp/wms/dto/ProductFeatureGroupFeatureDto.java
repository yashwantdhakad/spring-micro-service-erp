package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductFeatureGroupFeatureDto {
    private Long id;
    private String productFeatureId;
    private String description;
    private String abbrev;
    private String productFeatureTypeEnumId;
    private String sequenceNum;
    private LocalDateTime fromDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getProductFeatureTypeEnumId() {
        return productFeatureTypeEnumId;
    }

    public void setProductFeatureTypeEnumId(String productFeatureTypeEnumId) {
        this.productFeatureTypeEnumId = productFeatureTypeEnumId;
    }

    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
}
