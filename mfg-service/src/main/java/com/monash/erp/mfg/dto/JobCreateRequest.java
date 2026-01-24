package com.monash.erp.mfg.dto;

import java.time.LocalDateTime;
import java.util.List;

public class JobCreateRequest {

    private String purposeEnumId;
    private String workEffortName;
    private String facilityId;
    private LocalDateTime estimatedStartDate;
    private String estimatedWorkDuration;
    private String produceProductId;
    private String produceEstimatedQuantity;
    private String produceEstimatedAmount;
    private List<JobMaterialRequest> consumeItems;

    public String getPurposeEnumId() {
        return purposeEnumId;
    }

    public void setPurposeEnumId(String purposeEnumId) {
        this.purposeEnumId = purposeEnumId;
    }

    public String getWorkEffortName() {
        return workEffortName;
    }

    public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public LocalDateTime getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public String getEstimatedWorkDuration() {
        return estimatedWorkDuration;
    }

    public void setEstimatedWorkDuration(String estimatedWorkDuration) {
        this.estimatedWorkDuration = estimatedWorkDuration;
    }

    public String getProduceProductId() {
        return produceProductId;
    }

    public void setProduceProductId(String produceProductId) {
        this.produceProductId = produceProductId;
    }

    public String getProduceEstimatedQuantity() {
        return produceEstimatedQuantity;
    }

    public void setProduceEstimatedQuantity(String produceEstimatedQuantity) {
        this.produceEstimatedQuantity = produceEstimatedQuantity;
    }

    public String getProduceEstimatedAmount() {
        return produceEstimatedAmount;
    }

    public void setProduceEstimatedAmount(String produceEstimatedAmount) {
        this.produceEstimatedAmount = produceEstimatedAmount;
    }

    public List<JobMaterialRequest> getConsumeItems() {
        return consumeItems;
    }

    public void setConsumeItems(List<JobMaterialRequest> consumeItems) {
        this.consumeItems = consumeItems;
    }
}
