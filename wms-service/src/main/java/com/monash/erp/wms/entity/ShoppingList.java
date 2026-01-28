package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shoppingListId;
    private String shoppingListTypeId;
    private String parentShoppingListId;
    private String productStoreId;
    private String visitorId;
    private String partyId;
    private String listName;
    private String description;
    private String isPublic;
    private String isActive;
    private String currencyUom;
    private String shipmentMethodTypeId;
    private String carrierPartyId;
    private String carrierRoleTypeId;
    private String contactMechId;
    private String paymentMethodId;
    private String recurrenceInfoId;
    private LocalDateTime lastOrderedDate;
    private LocalDateTime lastAdminModified;
    private String productPromoCodeId;
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

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListTypeId() {
        return shoppingListTypeId;
    }

    public void setShoppingListTypeId(String shoppingListTypeId) {
        this.shoppingListTypeId = shoppingListTypeId;
    }

    public String getParentShoppingListId() {
        return parentShoppingListId;
    }

    public void setParentShoppingListId(String parentShoppingListId) {
        this.parentShoppingListId = parentShoppingListId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getCurrencyUom() {
        return currencyUom;
    }

    public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    public String getCarrierRoleTypeId() {
        return carrierRoleTypeId;
    }

    public void setCarrierRoleTypeId(String carrierRoleTypeId) {
        this.carrierRoleTypeId = carrierRoleTypeId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public LocalDateTime getLastOrderedDate() {
        return lastOrderedDate;
    }

    public void setLastOrderedDate(LocalDateTime lastOrderedDate) {
        this.lastOrderedDate = lastOrderedDate;
    }

    public LocalDateTime getLastAdminModified() {
        return lastAdminModified;
    }

    public void setLastAdminModified(LocalDateTime lastAdminModified) {
        this.lastAdminModified = lastAdminModified;
    }

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
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