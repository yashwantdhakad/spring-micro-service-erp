package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requirementId;
    private String requirementTypeId;
    private String facilityId;
    private String deliverableId;
    private String fixedAssetId;
    private String productId;
    private String statusId;
    private String description;
    private LocalDateTime requirementStartDate;
    private LocalDateTime requiredByDate;
    private BigDecimal estimatedBudget;
    private BigDecimal quantity;
    private String useCase;
    private String reason;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String itemCondition;
    private String lastSupplierId;
    private String lastSupplierName;
    private BigDecimal lastSupplierPrice;
    private BigDecimal openPoQty;
    private BigDecimal minOrderQty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getDeliverableId() {
        return deliverableId;
    }

    public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getRequirementStartDate() {
        return requirementStartDate;
    }

    public void setRequirementStartDate(LocalDateTime requirementStartDate) {
        this.requirementStartDate = requirementStartDate;
    }

    public LocalDateTime getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(LocalDateTime requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public BigDecimal getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getLastSupplierId() {
        return lastSupplierId;
    }

    public void setLastSupplierId(String lastSupplierId) {
        this.lastSupplierId = lastSupplierId;
    }

    public String getLastSupplierName() {
        return lastSupplierName;
    }

    public void setLastSupplierName(String lastSupplierName) {
        this.lastSupplierName = lastSupplierName;
    }

    public BigDecimal getLastSupplierPrice() {
        return lastSupplierPrice;
    }

    public void setLastSupplierPrice(BigDecimal lastSupplierPrice) {
        this.lastSupplierPrice = lastSupplierPrice;
    }

    public BigDecimal getOpenPoQty() {
        return openPoQty;
    }

    public void setOpenPoQty(BigDecimal openPoQty) {
        this.openPoQty = openPoQty;
    }

    public BigDecimal getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(BigDecimal minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

}