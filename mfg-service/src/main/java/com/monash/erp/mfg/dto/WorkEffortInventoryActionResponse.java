package com.monash.erp.mfg.dto;

public class WorkEffortInventoryActionResponse {

    private Long workEffortGoodStandardId;
    private String inventoryItemId;
    private String statusId;
    private String message;

    public WorkEffortInventoryActionResponse() {
    }

    public WorkEffortInventoryActionResponse(Long workEffortGoodStandardId, String inventoryItemId, String statusId, String message) {
        this.workEffortGoodStandardId = workEffortGoodStandardId;
        this.inventoryItemId = inventoryItemId;
        this.statusId = statusId;
        this.message = message;
    }

    public Long getWorkEffortGoodStandardId() {
        return workEffortGoodStandardId;
    }

    public void setWorkEffortGoodStandardId(Long workEffortGoodStandardId) {
        this.workEffortGoodStandardId = workEffortGoodStandardId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
