package com.monash.erp.wms.dto;

public class ProductContentDto {

    private String contentId;
    private String description;
    private String productContentTypeEnumId;
    private String contentLocation;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductContentTypeEnumId() {
        return productContentTypeEnumId;
    }

    public void setProductContentTypeEnumId(String productContentTypeEnumId) {
        this.productContentTypeEnumId = productContentTypeEnumId;
    }

    public String getContentLocation() {
        return contentLocation;
    }

    public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }
}
