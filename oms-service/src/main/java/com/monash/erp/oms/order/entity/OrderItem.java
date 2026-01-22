package com.monash.erp.oms.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String externalId;
    private String orderItemTypeId;
    private String orderItemGroupSeqId;
    private Boolean isItemGroupPrimary;
    private String fromInventoryItemId;
    private String budgetId;
    private String budgetItemSeqId;
    private String productId;
    private String supplierProductId;
    private String productFeatureId;
    private String prodCatalogId;
    private String productCategoryId;
    private Boolean isPromo;
    private String quoteId;
    private String quoteItemSeqId;
    private String shoppingListId;
    private String shoppingListItemSeqId;
    private String subscriptionId;
    private String deploymentId;
    private BigDecimal quantity;
    private BigDecimal cancelQuantity;
    private BigDecimal selectedAmount;
    private BigDecimal unitPrice;
    private BigDecimal unitListPrice;
    private BigDecimal unitAverageCost;
    private BigDecimal unitRecurringPrice;
    private BigDecimal discountRate;
    private Boolean isModifiedPrice;
    private String recurringFreqUomId;
    private String itemDescription;
    private String comments;
    private String correspondingPoId;
    private String statusId;
    private String syncStatusId;
    private LocalDateTime estimatedShipDate;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime autoCancelDate;
    private LocalDateTime dontCancelSetDate;
    private String dontCancelSetUserLogin;
    private LocalDateTime shipBeforeDate;
    private LocalDateTime shipAfterDate;
    private LocalDateTime reserveAfterDate;
    private LocalDateTime cancelBackOrderDate;
    private String overrideGlAccountId;
    private String salesOpportunityId;
    private String changeByUserLoginId;

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

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    public String getOrderItemGroupSeqId() {
        return orderItemGroupSeqId;
    }

    public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }

    public Boolean getIsItemGroupPrimary() {
        return isItemGroupPrimary;
    }

    public void setIsItemGroupPrimary(Boolean isItemGroupPrimary) {
        this.isItemGroupPrimary = isItemGroupPrimary;
    }

    public String getFromInventoryItemId() {
        return fromInventoryItemId;
    }

    public void setFromInventoryItemId(String fromInventoryItemId) {
        this.fromInventoryItemId = fromInventoryItemId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Boolean getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(Boolean isPromo) {
        this.isPromo = isPromo;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteItemSeqId() {
        return quoteItemSeqId;
    }

    public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListItemSeqId() {
        return shoppingListItemSeqId;
    }

    public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public BigDecimal getSelectedAmount() {
        return selectedAmount;
    }

    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitListPrice() {
        return unitListPrice;
    }

    public void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    public BigDecimal getUnitAverageCost() {
        return unitAverageCost;
    }

    public void setUnitAverageCost(BigDecimal unitAverageCost) {
        this.unitAverageCost = unitAverageCost;
    }

    public BigDecimal getUnitRecurringPrice() {
        return unitRecurringPrice;
    }

    public void setUnitRecurringPrice(BigDecimal unitRecurringPrice) {
        this.unitRecurringPrice = unitRecurringPrice;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public Boolean getIsModifiedPrice() {
        return isModifiedPrice;
    }

    public void setIsModifiedPrice(Boolean isModifiedPrice) {
        this.isModifiedPrice = isModifiedPrice;
    }

    public String getRecurringFreqUomId() {
        return recurringFreqUomId;
    }

    public void setRecurringFreqUomId(String recurringFreqUomId) {
        this.recurringFreqUomId = recurringFreqUomId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCorrespondingPoId() {
        return correspondingPoId;
    }

    public void setCorrespondingPoId(String correspondingPoId) {
        this.correspondingPoId = correspondingPoId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getSyncStatusId() {
        return syncStatusId;
    }

    public void setSyncStatusId(String syncStatusId) {
        this.syncStatusId = syncStatusId;
    }

    public LocalDateTime getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public LocalDateTime getAutoCancelDate() {
        return autoCancelDate;
    }

    public void setAutoCancelDate(LocalDateTime autoCancelDate) {
        this.autoCancelDate = autoCancelDate;
    }

    public LocalDateTime getDontCancelSetDate() {
        return dontCancelSetDate;
    }

    public void setDontCancelSetDate(LocalDateTime dontCancelSetDate) {
        this.dontCancelSetDate = dontCancelSetDate;
    }

    public String getDontCancelSetUserLogin() {
        return dontCancelSetUserLogin;
    }

    public void setDontCancelSetUserLogin(String dontCancelSetUserLogin) {
        this.dontCancelSetUserLogin = dontCancelSetUserLogin;
    }

    public LocalDateTime getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    public LocalDateTime getShipAfterDate() {
        return shipAfterDate;
    }

    public void setShipAfterDate(LocalDateTime shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }

    public LocalDateTime getReserveAfterDate() {
        return reserveAfterDate;
    }

    public void setReserveAfterDate(LocalDateTime reserveAfterDate) {
        this.reserveAfterDate = reserveAfterDate;
    }

    public LocalDateTime getCancelBackOrderDate() {
        return cancelBackOrderDate;
    }

    public void setCancelBackOrderDate(LocalDateTime cancelBackOrderDate) {
        this.cancelBackOrderDate = cancelBackOrderDate;
    }

    public String getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getChangeByUserLoginId() {
        return changeByUserLoginId;
    }

    public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
}
