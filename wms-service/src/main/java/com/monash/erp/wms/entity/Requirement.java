package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }
public void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setRequirementStartDate(LocalDateTime requirementStartDate) {
        this.requirementStartDate = requirementStartDate;
    }
public void setRequiredByDate(LocalDateTime requiredByDate) {
        this.requiredByDate = requiredByDate;
    }
public void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setUseCase(String useCase) {
        this.useCase = useCase;
    }
public void setReason(String reason) {
        this.reason = reason;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }
public void setLastSupplierId(String lastSupplierId) {
        this.lastSupplierId = lastSupplierId;
    }
public void setLastSupplierName(String lastSupplierName) {
        this.lastSupplierName = lastSupplierName;
    }
public void setLastSupplierPrice(BigDecimal lastSupplierPrice) {
        this.lastSupplierPrice = lastSupplierPrice;
    }
public void setOpenPoQty(BigDecimal openPoQty) {
        this.openPoQty = openPoQty;
    }
public void setMinOrderQty(BigDecimal minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

}
