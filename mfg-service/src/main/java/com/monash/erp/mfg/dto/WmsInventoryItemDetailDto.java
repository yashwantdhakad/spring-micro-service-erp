package com.monash.erp.mfg.dto;

public class WmsInventoryItemDetailDto {

    private String inventoryItemId;
    private String quantityOnHandDiff;
    private String itemIssuanceId;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getQuantityOnHandDiff() {
        return quantityOnHandDiff;
    }

    public void setQuantityOnHandDiff(String quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
}
