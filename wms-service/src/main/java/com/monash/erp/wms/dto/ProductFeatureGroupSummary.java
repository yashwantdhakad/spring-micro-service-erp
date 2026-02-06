package com.monash.erp.wms.dto;

public class ProductFeatureGroupSummary {
    private String productFeatureGroupId;
    private String description;

    public ProductFeatureGroupSummary() {}

    public ProductFeatureGroupSummary(String productFeatureGroupId, String description) {
        this.productFeatureGroupId = productFeatureGroupId;
        this.description = description;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
