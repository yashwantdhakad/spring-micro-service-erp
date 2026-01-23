package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductAssocRequest {

    private String toProductId;
    private String productAssocTypeEnumId;
    private String quantity;
    private LocalDateTime fromDate;

    public String getToProductId() {
        return toProductId;
    }

    public void setToProductId(String toProductId) {
        this.toProductId = toProductId;
    }

    public String getProductAssocTypeEnumId() {
        return productAssocTypeEnumId;
    }

    public void setProductAssocTypeEnumId(String productAssocTypeEnumId) {
        this.productAssocTypeEnumId = productAssocTypeEnumId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
}
