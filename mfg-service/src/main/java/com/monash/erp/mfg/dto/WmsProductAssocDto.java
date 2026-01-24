package com.monash.erp.mfg.dto;

public class WmsProductAssocDto {

    private WmsProductSummary toProduct;
    private String quantity;
    private WmsProductAssocTypeDto type;

    public WmsProductSummary getToProduct() {
        return toProduct;
    }

    public void setToProduct(WmsProductSummary toProduct) {
        this.toProduct = toProduct;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public WmsProductAssocTypeDto getType() {
        return type;
    }

    public void setType(WmsProductAssocTypeDto type) {
        this.type = type;
    }
}
