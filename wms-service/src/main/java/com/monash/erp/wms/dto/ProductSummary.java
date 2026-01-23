package com.monash.erp.wms.dto;

public class ProductSummary {

    private String productId;
    private String productName;
    private String productTypeId;

    public ProductSummary() {
    }

    public ProductSummary(String productId, String productName, String productTypeId) {
        this.productId = productId;
        this.productName = productName;
        this.productTypeId = productTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }
}
