package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }
public void setShoppingListTypeId(String shoppingListTypeId) {
        this.shoppingListTypeId = shoppingListTypeId;
    }
public void setParentShoppingListId(String parentShoppingListId) {
        this.parentShoppingListId = parentShoppingListId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setListName(String listName) {
        this.listName = listName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
public void setCarrierRoleTypeId(String carrierRoleTypeId) {
        this.carrierRoleTypeId = carrierRoleTypeId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
public void setLastOrderedDate(LocalDateTime lastOrderedDate) {
        this.lastOrderedDate = lastOrderedDate;
    }
public void setLastAdminModified(LocalDateTime lastAdminModified) {
        this.lastAdminModified = lastAdminModified;
    }
public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
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

}
