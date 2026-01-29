package com.monash.erp.mfg.dto;

import java.time.LocalDateTime;

public class WmsInventoryItemDetailRequest {

    private String inventoryItemId;
    private String inventoryItemDetailSeqId;
    private LocalDateTime effectiveDate;
    private String quantityOnHandDiff;
    private String availableToPromiseDiff;
    private String accountingQuantityDiff;
    private String workEffortId;
    private String itemIssuanceId;
    private String description;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemDetailSeqId() {
        return inventoryItemDetailSeqId;
    }

    public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId;
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getQuantityOnHandDiff() {
        return quantityOnHandDiff;
    }

    public void setQuantityOnHandDiff(String quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }

    public String getAvailableToPromiseDiff() {
        return availableToPromiseDiff;
    }

    public void setAvailableToPromiseDiff(String availableToPromiseDiff) {
        this.availableToPromiseDiff = availableToPromiseDiff;
    }

    public String getAccountingQuantityDiff() {
        return accountingQuantityDiff;
    }

    public void setAccountingQuantityDiff(String accountingQuantityDiff) {
        this.accountingQuantityDiff = accountingQuantityDiff;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
