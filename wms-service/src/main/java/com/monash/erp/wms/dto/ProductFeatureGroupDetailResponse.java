package com.monash.erp.wms.dto;

import java.util.List;

public class ProductFeatureGroupDetailResponse {
    private String productFeatureGroupId;
    private String description;
    private List<ProductFeatureGroupCategoryDto> categories;
    private List<ProductFeatureGroupFeatureDto> features;

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

    public List<ProductFeatureGroupCategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductFeatureGroupCategoryDto> categories) {
        this.categories = categories;
    }

    public List<ProductFeatureGroupFeatureDto> getFeatures() {
        return features;
    }

    public void setFeatures(List<ProductFeatureGroupFeatureDto> features) {
        this.features = features;
    }
}
