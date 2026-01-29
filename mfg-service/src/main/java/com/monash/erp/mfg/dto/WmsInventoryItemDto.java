package com.monash.erp.mfg.dto;

public class WmsInventoryItemDto {

    private String inventoryItemId;
    private String productId;
    private String quantityOnHandTotal;
    private String availableToPromiseTotal;
    private String accountingQuantityTotal;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantityOnHandTotal() {
        return quantityOnHandTotal;
    }

    public void setQuantityOnHandTotal(String quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }

    public String getAvailableToPromiseTotal() {
        return availableToPromiseTotal;
    }

    public void setAvailableToPromiseTotal(String availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }

    public String getAccountingQuantityTotal() {
        return accountingQuantityTotal;
    }

    public void setAccountingQuantityTotal(String accountingQuantityTotal) {
        this.accountingQuantityTotal = accountingQuantityTotal;
    }
}
