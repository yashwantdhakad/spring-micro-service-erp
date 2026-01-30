package com.monash.erp.mfg.dto;

public class JobProduceResponse {

    private String inventoryItemId;

    public JobProduceResponse() {
    }

    public JobProduceResponse(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
}
