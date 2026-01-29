package com.monash.erp.mfg.dto;

public class JobGoodStandardDto {

    private Long id;
    private String productId;
    private String estimatedQuantity;
    private String workEffortGoodStdTypeId;
    private String statusId;
    private String workEffortId;
    private String reservedQuantity;
    private String issuedQuantity;
    private String remainingQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(String estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public String getWorkEffortGoodStdTypeId() {
        return workEffortGoodStdTypeId;
    }

    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(String reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public String getIssuedQuantity() {
        return issuedQuantity;
    }

    public void setIssuedQuantity(String issuedQuantity) {
        this.issuedQuantity = issuedQuantity;
    }

    public String getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(String remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
}
