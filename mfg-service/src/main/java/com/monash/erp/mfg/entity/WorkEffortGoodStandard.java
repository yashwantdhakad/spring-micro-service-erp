package com.monash.erp.mfg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class WorkEffortGoodStandard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String productId;
    private String workEffortGoodStdTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String statusId;
    private String estimatedQuantity;
    private String estimatedCost;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String drawingItemNumber;
    private String isNonProcurable;
    private String isCustomerSupplied;
    private String fromWholeAssembly;
    private String itemCondition;
    private String reasonEnumId;
    private String comment;
    private LocalDateTime expediteDate;
    private String isExpedite;
    private String cancelQuantity;
    private String recreateQuantity;
    private String wegsReferenceNumber;
    private String isPmaAllowed;
    private String noPmaAllowed;
    private String invAuthEnumId;
    private String mltrUseAuth;
    private String commUseAuth;
    private String mrgtAuth;
    private String mrslAuth;
    private String propRepAuth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getWorkEffortGoodStdTypeId() {
        return workEffortGoodStdTypeId;
    }

    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(String estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public String getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
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

    public String getDrawingItemNumber() {
        return drawingItemNumber;
    }

    public void setDrawingItemNumber(String drawingItemNumber) {
        this.drawingItemNumber = drawingItemNumber;
    }

    public String getIsNonProcurable() {
        return isNonProcurable;
    }

    public void setIsNonProcurable(String isNonProcurable) {
        this.isNonProcurable = isNonProcurable;
    }

    public String getIsCustomerSupplied() {
        return isCustomerSupplied;
    }

    public void setIsCustomerSupplied(String isCustomerSupplied) {
        this.isCustomerSupplied = isCustomerSupplied;
    }

    public String getFromWholeAssembly() {
        return fromWholeAssembly;
    }

    public void setFromWholeAssembly(String fromWholeAssembly) {
        this.fromWholeAssembly = fromWholeAssembly;
    }

    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getExpediteDate() {
        return expediteDate;
    }

    public void setExpediteDate(LocalDateTime expediteDate) {
        this.expediteDate = expediteDate;
    }

    public String getIsExpedite() {
        return isExpedite;
    }

    public void setIsExpedite(String isExpedite) {
        this.isExpedite = isExpedite;
    }

    public String getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(String cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public String getRecreateQuantity() {
        return recreateQuantity;
    }

    public void setRecreateQuantity(String recreateQuantity) {
        this.recreateQuantity = recreateQuantity;
    }

    public String getWegsReferenceNumber() {
        return wegsReferenceNumber;
    }

    public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
    }

    public String getIsPmaAllowed() {
        return isPmaAllowed;
    }

    public void setIsPmaAllowed(String isPmaAllowed) {
        this.isPmaAllowed = isPmaAllowed;
    }

    public String getNoPmaAllowed() {
        return noPmaAllowed;
    }

    public void setNoPmaAllowed(String noPmaAllowed) {
        this.noPmaAllowed = noPmaAllowed;
    }

    public String getInvAuthEnumId() {
        return invAuthEnumId;
    }

    public void setInvAuthEnumId(String invAuthEnumId) {
        this.invAuthEnumId = invAuthEnumId;
    }

    public String getMltrUseAuth() {
        return mltrUseAuth;
    }

    public void setMltrUseAuth(String mltrUseAuth) {
        this.mltrUseAuth = mltrUseAuth;
    }

    public String getCommUseAuth() {
        return commUseAuth;
    }

    public void setCommUseAuth(String commUseAuth) {
        this.commUseAuth = commUseAuth;
    }

    public String getMrgtAuth() {
        return mrgtAuth;
    }

    public void setMrgtAuth(String mrgtAuth) {
        this.mrgtAuth = mrgtAuth;
    }

    public String getMrslAuth() {
        return mrslAuth;
    }

    public void setMrslAuth(String mrslAuth) {
        this.mrslAuth = mrslAuth;
    }

    public String getPropRepAuth() {
        return propRepAuth;
    }

    public void setPropRepAuth(String propRepAuth) {
        this.propRepAuth = propRepAuth;
    }
}
