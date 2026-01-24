package com.monash.erp.mfg.dto;

public class JobMaterialRequest {

    private String productId;
    private String estimatedQuantity;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(String estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }
}
