package com.monash.erp.mfg.dto;

import java.time.LocalDateTime;

public class WmsItemIssuanceRequest {

    private String itemIssuanceId;
    private String inventoryItemId;
    private String workEffortId;
    private LocalDateTime issuedDateTime;
    private String issuedByUserLoginId;
    private String quantity;
    private String wegsReferenceNumber;

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public LocalDateTime getIssuedDateTime() {
        return issuedDateTime;
    }

    public void setIssuedDateTime(LocalDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }

    public String getIssuedByUserLoginId() {
        return issuedByUserLoginId;
    }

    public void setIssuedByUserLoginId(String issuedByUserLoginId) {
        this.issuedByUserLoginId = issuedByUserLoginId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWegsReferenceNumber() {
        return wegsReferenceNumber;
    }

    public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
    }
}
