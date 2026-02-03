package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "order_item",
        indexes = {
                @Index(name = "idx_order_item_order_id", columnList = "order_id"),
                @Index(name = "idx_order_item_order_item_seq", columnList = "order_id, order_item_seq_id"),
                @Index(name = "idx_order_item_product_id", columnList = "product_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderItem extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String externalId;
    private String orderItemTypeId;
    private String orderItemGroupSeqId;
    private String isItemGroupPrimary;
    private String fromInventoryItemId;
    private String budgetId;
    private String budgetItemSeqId;
    private String productId;
    private String productFeatureId;
    private String prodCatalogId;
    private String productCategoryId;
    private String isPromo;
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
    private String isModifiedPrice;
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
    private LocalDateTime cancelBackOrderDate;
    private String overrideGlAccountId;
    private String salesOpportunityId;
    private String changeByUserLoginId;
    private String qaApproved;
    private String qaOverridePartyId;
    private String qaOverride;
    private LocalDateTime qaOverrideValidFrom;
    private LocalDateTime qaOverrideValidThru;
    private LocalDateTime initialDeliveryDate;
    private String qaOverrideNote;
    private String supplierProductId;
    private String invAuthEnumId;
    private String mltrUseAuth;
    private String commUseAuth;
    private String mrgtAuth;
    private String mrslAuth;
    private String propRepAuth;
    private String priorityCode;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }
public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }
public void setIsItemGroupPrimary(String isItemGroupPrimary) {
        this.isItemGroupPrimary = isItemGroupPrimary;
    }
public void setFromInventoryItemId(String fromInventoryItemId) {
        this.fromInventoryItemId = fromInventoryItemId;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setIsPromo(String isPromo) {
        this.isPromo = isPromo;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }
public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }
public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }
public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
public void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }
public void setUnitAverageCost(BigDecimal unitAverageCost) {
        this.unitAverageCost = unitAverageCost;
    }
public void setUnitRecurringPrice(BigDecimal unitRecurringPrice) {
        this.unitRecurringPrice = unitRecurringPrice;
    }
public void setIsModifiedPrice(String isModifiedPrice) {
        this.isModifiedPrice = isModifiedPrice;
    }
public void setRecurringFreqUomId(String recurringFreqUomId) {
        this.recurringFreqUomId = recurringFreqUomId;
    }
public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setCorrespondingPoId(String correspondingPoId) {
        this.correspondingPoId = correspondingPoId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setSyncStatusId(String syncStatusId) {
        this.syncStatusId = syncStatusId;
    }
public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }
public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
public void setAutoCancelDate(LocalDateTime autoCancelDate) {
        this.autoCancelDate = autoCancelDate;
    }
public void setDontCancelSetDate(LocalDateTime dontCancelSetDate) {
        this.dontCancelSetDate = dontCancelSetDate;
    }
public void setDontCancelSetUserLogin(String dontCancelSetUserLogin) {
        this.dontCancelSetUserLogin = dontCancelSetUserLogin;
    }
public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }
public void setShipAfterDate(LocalDateTime shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }
public void setCancelBackOrderDate(LocalDateTime cancelBackOrderDate) {
        this.cancelBackOrderDate = cancelBackOrderDate;
    }
public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
public void setQaApproved(String qaApproved) {
        this.qaApproved = qaApproved;
    }
public void setQaOverridePartyId(String qaOverridePartyId) {
        this.qaOverridePartyId = qaOverridePartyId;
    }
public void setQaOverride(String qaOverride) {
        this.qaOverride = qaOverride;
    }
public void setQaOverrideValidFrom(LocalDateTime qaOverrideValidFrom) {
        this.qaOverrideValidFrom = qaOverrideValidFrom;
    }
public void setQaOverrideValidThru(LocalDateTime qaOverrideValidThru) {
        this.qaOverrideValidThru = qaOverrideValidThru;
    }
public void setInitialDeliveryDate(LocalDateTime initialDeliveryDate) {
        this.initialDeliveryDate = initialDeliveryDate;
    }
public void setQaOverrideNote(String qaOverrideNote) {
        this.qaOverrideNote = qaOverrideNote;
    }
public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }
public void setInvAuthEnumId(String invAuthEnumId) {
        this.invAuthEnumId = invAuthEnumId;
    }
public void setMltrUseAuth(String mltrUseAuth) {
        this.mltrUseAuth = mltrUseAuth;
    }
public void setCommUseAuth(String commUseAuth) {
        this.commUseAuth = commUseAuth;
    }
public void setMrgtAuth(String mrgtAuth) {
        this.mrgtAuth = mrgtAuth;
    }
public void setMrslAuth(String mrslAuth) {
        this.mrslAuth = mrslAuth;
    }
public void setPropRepAuth(String propRepAuth) {
        this.propRepAuth = propRepAuth;
    }
public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

}
