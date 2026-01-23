package com.monash.erp.wms.dto;

public class ProductAssocTypeDto {

    private String productAssocTypeId;
    private String description;

    public ProductAssocTypeDto() {
    }

    public ProductAssocTypeDto(String productAssocTypeId, String description) {
        this.productAssocTypeId = productAssocTypeId;
        this.description = description;
    }

    public String getProductAssocTypeId() {
        return productAssocTypeId;
    }

    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
