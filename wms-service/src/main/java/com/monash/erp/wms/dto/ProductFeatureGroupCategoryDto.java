package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductFeatureGroupCategoryDto {
    private Long id;
    private String productCategoryId;
    private String categoryName;
    private String applTypeEnumId;
    private LocalDateTime fromDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getApplTypeEnumId() {
        return applTypeEnumId;
    }

    public void setApplTypeEnumId(String applTypeEnumId) {
        this.applTypeEnumId = applTypeEnumId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
}
