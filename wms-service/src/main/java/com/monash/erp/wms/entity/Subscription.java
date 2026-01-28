package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subscriptionId;
    private String description;
    private String subscriptionResourceId;
    private String communicationEventId;
    private String contactMechId;
    private String originatedFromPartyId;
    private String originatedFromRoleTypeId;
    private String partyId;
    private String roleTypeId;
    private String partyNeedId;
    private String needTypeId;
    private String orderId;
    private String orderItemSeqId;
    private String productId;
    private String productCategoryId;
    private String inventoryItemId;
    private String subscriptionTypeId;
    private String externalSubscriptionId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime purchaseFromDate;
    private LocalDateTime purchaseThruDate;
    private BigDecimal maxLifeTime;
    private String maxLifeTimeUomId;
    private BigDecimal availableTime;
    private String availableTimeUomId;
    private BigDecimal useCountLimit;
    private BigDecimal useTime;
    private String useTimeUomId;
    private String automaticExtend;
    private BigDecimal canclAutmExtTime;
    private String canclAutmExtTimeUomId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getOriginatedFromPartyId() {
        return originatedFromPartyId;
    }

    public void setOriginatedFromPartyId(String originatedFromPartyId) {
        this.originatedFromPartyId = originatedFromPartyId;
    }

    public String getOriginatedFromRoleTypeId() {
        return originatedFromRoleTypeId;
    }

    public void setOriginatedFromRoleTypeId(String originatedFromRoleTypeId) {
        this.originatedFromRoleTypeId = originatedFromRoleTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getPartyNeedId() {
        return partyNeedId;
    }

    public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId;
    }

    public String getNeedTypeId() {
        return needTypeId;
    }

    public void setNeedTypeId(String needTypeId) {
        this.needTypeId = needTypeId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public String getExternalSubscriptionId() {
        return externalSubscriptionId;
    }

    public void setExternalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
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

    public LocalDateTime getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(LocalDateTime purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public LocalDateTime getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(LocalDateTime purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigDecimal getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(BigDecimal maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public String getMaxLifeTimeUomId() {
        return maxLifeTimeUomId;
    }

    public void setMaxLifeTimeUomId(String maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId;
    }

    public BigDecimal getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(BigDecimal availableTime) {
        this.availableTime = availableTime;
    }

    public String getAvailableTimeUomId() {
        return availableTimeUomId;
    }

    public void setAvailableTimeUomId(String availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId;
    }

    public BigDecimal getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigDecimal useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigDecimal getUseTime() {
        return useTime;
    }

    public void setUseTime(BigDecimal useTime) {
        this.useTime = useTime;
    }

    public String getUseTimeUomId() {
        return useTimeUomId;
    }

    public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }

    public String getAutomaticExtend() {
        return automaticExtend;
    }

    public void setAutomaticExtend(String automaticExtend) {
        this.automaticExtend = automaticExtend;
    }

    public BigDecimal getCanclAutmExtTime() {
        return canclAutmExtTime;
    }

    public void setCanclAutmExtTime(BigDecimal canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
    }

    public String getCanclAutmExtTimeUomId() {
        return canclAutmExtTimeUomId;
    }

    public void setCanclAutmExtTimeUomId(String canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId;
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

}