package com.monash.erp.wms.dto;

import java.time.LocalDateTime;

public class ProductAssocDto {

    private ProductSummary product;
    private ProductSummary toProduct;
    private ProductAssocTypeDto type;
    private LocalDateTime fromDate;
    private String quantity;

    public ProductSummary getProduct() {
        return product;
    }

    public void setProduct(ProductSummary product) {
        this.product = product;
    }

    public ProductSummary getToProduct() {
        return toProduct;
    }

    public void setToProduct(ProductSummary toProduct) {
        this.toProduct = toProduct;
    }

    public ProductAssocTypeDto getType() {
        return type;
    }

    public void setType(ProductAssocTypeDto type) {
        this.type = type;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
