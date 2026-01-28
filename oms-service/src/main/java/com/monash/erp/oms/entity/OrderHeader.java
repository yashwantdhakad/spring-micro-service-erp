package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderTypeId;
    private String orderName;
    private String externalId;
    private String salesChannelEnumId;
    private LocalDateTime orderDate;
    private String priority;
    private LocalDateTime entryDate;
    private LocalDateTime pickSheetPrintedDate;
    private String visitId;
    private String statusId;
    private String createdBy;
    private String firstAttemptOrderId;
    private String currencyUom;
    private String syncStatusId;
    private String billingAccountId;
    private String originFacilityId;
    private String webSiteId;
    private String productStoreId;
    private String terminalId;
    private String transactionId;
    private String autoOrderShoppingListId;
    private String needsInventoryIssuance;
    private String isRushOrder;
    private String internalCode;
    private BigDecimal remainingSubTotal;
    private BigDecimal grandTotal;
    private String isViewed;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String workEffortId;
    private String overrideCreditLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getPickSheetPrintedDate() {
        return pickSheetPrintedDate;
    }

    public void setPickSheetPrintedDate(LocalDateTime pickSheetPrintedDate) {
        this.pickSheetPrintedDate = pickSheetPrintedDate;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getFirstAttemptOrderId() {
        return firstAttemptOrderId;
    }

    public void setFirstAttemptOrderId(String firstAttemptOrderId) {
        this.firstAttemptOrderId = firstAttemptOrderId;
    }

    public String getCurrencyUom() {
        return currencyUom;
    }

    public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }

    public String getSyncStatusId() {
        return syncStatusId;
    }

    public void setSyncStatusId(String syncStatusId) {
        this.syncStatusId = syncStatusId;
    }

    public String getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAutoOrderShoppingListId() {
        return autoOrderShoppingListId;
    }

    public void setAutoOrderShoppingListId(String autoOrderShoppingListId) {
        this.autoOrderShoppingListId = autoOrderShoppingListId;
    }

    public String getNeedsInventoryIssuance() {
        return needsInventoryIssuance;
    }

    public void setNeedsInventoryIssuance(String needsInventoryIssuance) {
        this.needsInventoryIssuance = needsInventoryIssuance;
    }

    public String getIsRushOrder() {
        return isRushOrder;
    }

    public void setIsRushOrder(String isRushOrder) {
        this.isRushOrder = isRushOrder;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public BigDecimal getRemainingSubTotal() {
        return remainingSubTotal;
    }

    public void setRemainingSubTotal(BigDecimal remainingSubTotal) {
        this.remainingSubTotal = remainingSubTotal;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getIsViewed() {
        return isViewed;
    }

    public void setIsViewed(String isViewed) {
        this.isViewed = isViewed;
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

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getOverrideCreditLimit() {
        return overrideCreditLimit;
    }

    public void setOverrideCreditLimit(String overrideCreditLimit) {
        this.overrideCreditLimit = overrideCreditLimit;
    }

}