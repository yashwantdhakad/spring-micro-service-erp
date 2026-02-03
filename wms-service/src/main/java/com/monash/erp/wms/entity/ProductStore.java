package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ProductStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String productStoreId;
    @Column(columnDefinition = "TEXT")
    private String primaryStoreGroupId;
    @Column(columnDefinition = "TEXT")
    private String storeName;
    @Column(columnDefinition = "TEXT")
    private String companyName;
    @Column(columnDefinition = "TEXT")
    private String title;
    @Column(columnDefinition = "TEXT")
    private String subtitle;
    @Column(columnDefinition = "TEXT")
    private String payToPartyId;
    @Column(columnDefinition = "TEXT")
    private String daysToCancelNonPay;
    @Column(columnDefinition = "TEXT")
    private String manualAuthIsCapture;
    @Column(columnDefinition = "TEXT")
    private String prorateShipping;
    @Column(columnDefinition = "TEXT")
    private String prorateTaxes;
    @Column(columnDefinition = "TEXT")
    private String viewCartOnAdd;
    @Column(columnDefinition = "TEXT")
    private String autoSaveCart;
    @Column(columnDefinition = "TEXT")
    private String autoApproveReviews;
    @Column(columnDefinition = "TEXT")
    private String isDemoStore;
    @Column(columnDefinition = "TEXT")
    private String isImmediatelyFulfilled;
    @Column(columnDefinition = "TEXT")
    private String inventoryFacilityId;
    @Column(columnDefinition = "TEXT")
    private String oneInventoryFacility;
    @Column(columnDefinition = "TEXT")
    private String checkInventory;
    @Column(columnDefinition = "TEXT")
    private String reserveInventory;
    @Column(columnDefinition = "TEXT")
    private String reserveOrderEnumId;
    @Column(columnDefinition = "TEXT")
    private String requireInventory;
    @Column(columnDefinition = "TEXT")
    private String balanceResOnOrderCreation;
    @Column(columnDefinition = "TEXT")
    private String requirementMethodEnumId;
    @Column(columnDefinition = "TEXT")
    private String orderNumberPrefix;
    @Column(columnDefinition = "TEXT")
    private String defaultLocaleString;
    @Column(columnDefinition = "TEXT")
    private String defaultCurrencyUomId;
    @Column(columnDefinition = "TEXT")
    private String defaultTimeZoneString;
    @Column(columnDefinition = "TEXT")
    private String defaultSalesChannelEnumId;
    @Column(columnDefinition = "TEXT")
    private String allowPassword;
    @Column(columnDefinition = "TEXT")
    private String defaultPassword;
    @Column(columnDefinition = "TEXT")
    private String explodeOrderItems;
    @Column(columnDefinition = "TEXT")
    private String checkGcBalance;
    @Column(columnDefinition = "TEXT")
    private String retryFailedAuths;
    @Column(columnDefinition = "TEXT")
    private String headerApprovedStatus;
    @Column(columnDefinition = "TEXT")
    private String itemApprovedStatus;
    @Column(columnDefinition = "TEXT")
    private String digitalItemApprovedStatus;
    @Column(columnDefinition = "TEXT")
    private String headerDeclinedStatus;
    @Column(columnDefinition = "TEXT")
    private String itemDeclinedStatus;
    @Column(columnDefinition = "TEXT")
    private String headerCancelStatus;
    @Column(columnDefinition = "TEXT")
    private String itemCancelStatus;
    @Column(columnDefinition = "TEXT")
    private String authDeclinedMessage;
    @Column(columnDefinition = "TEXT")
    private String authFraudMessage;
    @Column(columnDefinition = "TEXT")
    private String authErrorMessage;
    @Column(columnDefinition = "TEXT")
    private String visualThemeId;
    @Column(columnDefinition = "TEXT")
    private String storeCreditAccountEnumId;
    @Column(columnDefinition = "TEXT")
    private String usePrimaryEmailUsername;
    @Column(columnDefinition = "TEXT")
    private String requireCustomerRole;
    @Column(columnDefinition = "TEXT")
    private String autoInvoiceDigitalItems;
    @Column(columnDefinition = "TEXT")
    private String reqShipAddrForDigItems;
    @Column(columnDefinition = "TEXT")
    private String showCheckoutGiftOptions;
    @Column(columnDefinition = "TEXT")
    private String selectPaymentTypePerItem;
    @Column(columnDefinition = "TEXT")
    private String showPricesWithVatTax;
    @Column(columnDefinition = "TEXT")
    private String showTaxIsExempt;
    @Column(columnDefinition = "TEXT")
    private String vatTaxAuthGeoId;
    @Column(columnDefinition = "TEXT")
    private String vatTaxAuthPartyId;
    @Column(columnDefinition = "TEXT")
    private String enableAutoSuggestionList;
    @Column(columnDefinition = "TEXT")
    private String enableDigProdUpload;
    @Column(columnDefinition = "TEXT")
    private String prodSearchExcludeVariants;
    @Column(columnDefinition = "TEXT")
    private String digProdUploadCategoryId;
    @Column(columnDefinition = "TEXT")
    private String autoOrderCcTryExp;
    @Column(columnDefinition = "TEXT")
    private String autoOrderCcTryOtherCards;
    @Column(columnDefinition = "TEXT")
    private String autoOrderCcTryLaterNsf;
    @Column(columnDefinition = "TEXT")
    private String autoOrderCcTryLaterMax;
    @Column(columnDefinition = "TEXT")
    private String storeCreditValidDays;
    @Column(columnDefinition = "TEXT")
    private String autoApproveInvoice;
    @Column(columnDefinition = "TEXT")
    private String autoApproveOrder;
    @Column(columnDefinition = "TEXT")
    private String shipIfCaptureFails;
    @Column(columnDefinition = "TEXT")
    private String setOwnerUponIssuance;
    @Column(columnDefinition = "TEXT")
    private String reqReturnInventoryReceive;
    @Column(columnDefinition = "TEXT")
    private String addToCartRemoveIncompat;
    @Column(columnDefinition = "TEXT")
    private String addToCartReplaceUpsell;
    @Column(columnDefinition = "TEXT")
    private String splitPayPrefPerShpGrp;
    @Column(columnDefinition = "TEXT")
    private String managedByLot;
    @Column(columnDefinition = "TEXT")
    private String showOutOfStockProducts;
    @Column(columnDefinition = "TEXT")
    private String orderDecimalQuantity;
    @Column(columnDefinition = "TEXT")
    private String allowComment;
    @Column(columnDefinition = "TEXT")
    private String allocateInventory;
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setPrimaryStoreGroupId(String primaryStoreGroupId) {
        this.primaryStoreGroupId = primaryStoreGroupId;
    }
public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
public void setTitle(String title) {
        this.title = title;
    }
public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
public void setPayToPartyId(String payToPartyId) {
        this.payToPartyId = payToPartyId;
    }
public void setDaysToCancelNonPay(String daysToCancelNonPay) {
        this.daysToCancelNonPay = daysToCancelNonPay;
    }
public void setManualAuthIsCapture(String manualAuthIsCapture) {
        this.manualAuthIsCapture = manualAuthIsCapture;
    }
public void setProrateShipping(String prorateShipping) {
        this.prorateShipping = prorateShipping;
    }
public void setProrateTaxes(String prorateTaxes) {
        this.prorateTaxes = prorateTaxes;
    }
public void setViewCartOnAdd(String viewCartOnAdd) {
        this.viewCartOnAdd = viewCartOnAdd;
    }
public void setAutoSaveCart(String autoSaveCart) {
        this.autoSaveCart = autoSaveCart;
    }
public void setAutoApproveReviews(String autoApproveReviews) {
        this.autoApproveReviews = autoApproveReviews;
    }
public void setIsDemoStore(String isDemoStore) {
        this.isDemoStore = isDemoStore;
    }
public void setIsImmediatelyFulfilled(String isImmediatelyFulfilled) {
        this.isImmediatelyFulfilled = isImmediatelyFulfilled;
    }
public void setInventoryFacilityId(String inventoryFacilityId) {
        this.inventoryFacilityId = inventoryFacilityId;
    }
public void setOneInventoryFacility(String oneInventoryFacility) {
        this.oneInventoryFacility = oneInventoryFacility;
    }
public void setCheckInventory(String checkInventory) {
        this.checkInventory = checkInventory;
    }
public void setReserveInventory(String reserveInventory) {
        this.reserveInventory = reserveInventory;
    }
public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }
public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory;
    }
public void setBalanceResOnOrderCreation(String balanceResOnOrderCreation) {
        this.balanceResOnOrderCreation = balanceResOnOrderCreation;
    }
public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }
public void setOrderNumberPrefix(String orderNumberPrefix) {
        this.orderNumberPrefix = orderNumberPrefix;
    }
public void setDefaultLocaleString(String defaultLocaleString) {
        this.defaultLocaleString = defaultLocaleString;
    }
public void setDefaultCurrencyUomId(String defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId;
    }
public void setDefaultTimeZoneString(String defaultTimeZoneString) {
        this.defaultTimeZoneString = defaultTimeZoneString;
    }
public void setDefaultSalesChannelEnumId(String defaultSalesChannelEnumId) {
        this.defaultSalesChannelEnumId = defaultSalesChannelEnumId;
    }
public void setAllowPassword(String allowPassword) {
        this.allowPassword = allowPassword;
    }
public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }
public void setExplodeOrderItems(String explodeOrderItems) {
        this.explodeOrderItems = explodeOrderItems;
    }
public void setCheckGcBalance(String checkGcBalance) {
        this.checkGcBalance = checkGcBalance;
    }
public void setRetryFailedAuths(String retryFailedAuths) {
        this.retryFailedAuths = retryFailedAuths;
    }
public void setHeaderApprovedStatus(String headerApprovedStatus) {
        this.headerApprovedStatus = headerApprovedStatus;
    }
public void setItemApprovedStatus(String itemApprovedStatus) {
        this.itemApprovedStatus = itemApprovedStatus;
    }
public void setDigitalItemApprovedStatus(String digitalItemApprovedStatus) {
        this.digitalItemApprovedStatus = digitalItemApprovedStatus;
    }
public void setHeaderDeclinedStatus(String headerDeclinedStatus) {
        this.headerDeclinedStatus = headerDeclinedStatus;
    }
public void setItemDeclinedStatus(String itemDeclinedStatus) {
        this.itemDeclinedStatus = itemDeclinedStatus;
    }
public void setHeaderCancelStatus(String headerCancelStatus) {
        this.headerCancelStatus = headerCancelStatus;
    }
public void setItemCancelStatus(String itemCancelStatus) {
        this.itemCancelStatus = itemCancelStatus;
    }
public void setAuthDeclinedMessage(String authDeclinedMessage) {
        this.authDeclinedMessage = authDeclinedMessage;
    }
public void setAuthFraudMessage(String authFraudMessage) {
        this.authFraudMessage = authFraudMessage;
    }
public void setAuthErrorMessage(String authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
    }
public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }
public void setStoreCreditAccountEnumId(String storeCreditAccountEnumId) {
        this.storeCreditAccountEnumId = storeCreditAccountEnumId;
    }
public void setUsePrimaryEmailUsername(String usePrimaryEmailUsername) {
        this.usePrimaryEmailUsername = usePrimaryEmailUsername;
    }
public void setRequireCustomerRole(String requireCustomerRole) {
        this.requireCustomerRole = requireCustomerRole;
    }
public void setAutoInvoiceDigitalItems(String autoInvoiceDigitalItems) {
        this.autoInvoiceDigitalItems = autoInvoiceDigitalItems;
    }
public void setReqShipAddrForDigItems(String reqShipAddrForDigItems) {
        this.reqShipAddrForDigItems = reqShipAddrForDigItems;
    }
public void setShowCheckoutGiftOptions(String showCheckoutGiftOptions) {
        this.showCheckoutGiftOptions = showCheckoutGiftOptions;
    }
public void setSelectPaymentTypePerItem(String selectPaymentTypePerItem) {
        this.selectPaymentTypePerItem = selectPaymentTypePerItem;
    }
public void setShowPricesWithVatTax(String showPricesWithVatTax) {
        this.showPricesWithVatTax = showPricesWithVatTax;
    }
public void setShowTaxIsExempt(String showTaxIsExempt) {
        this.showTaxIsExempt = showTaxIsExempt;
    }
public void setVatTaxAuthGeoId(String vatTaxAuthGeoId) {
        this.vatTaxAuthGeoId = vatTaxAuthGeoId;
    }
public void setVatTaxAuthPartyId(String vatTaxAuthPartyId) {
        this.vatTaxAuthPartyId = vatTaxAuthPartyId;
    }
public void setEnableAutoSuggestionList(String enableAutoSuggestionList) {
        this.enableAutoSuggestionList = enableAutoSuggestionList;
    }
public void setEnableDigProdUpload(String enableDigProdUpload) {
        this.enableDigProdUpload = enableDigProdUpload;
    }
public void setProdSearchExcludeVariants(String prodSearchExcludeVariants) {
        this.prodSearchExcludeVariants = prodSearchExcludeVariants;
    }
public void setDigProdUploadCategoryId(String digProdUploadCategoryId) {
        this.digProdUploadCategoryId = digProdUploadCategoryId;
    }
public void setAutoOrderCcTryExp(String autoOrderCcTryExp) {
        this.autoOrderCcTryExp = autoOrderCcTryExp;
    }
public void setAutoOrderCcTryOtherCards(String autoOrderCcTryOtherCards) {
        this.autoOrderCcTryOtherCards = autoOrderCcTryOtherCards;
    }
public void setAutoOrderCcTryLaterNsf(String autoOrderCcTryLaterNsf) {
        this.autoOrderCcTryLaterNsf = autoOrderCcTryLaterNsf;
    }
public void setAutoOrderCcTryLaterMax(String autoOrderCcTryLaterMax) {
        this.autoOrderCcTryLaterMax = autoOrderCcTryLaterMax;
    }
public void setStoreCreditValidDays(String storeCreditValidDays) {
        this.storeCreditValidDays = storeCreditValidDays;
    }
public void setAutoApproveInvoice(String autoApproveInvoice) {
        this.autoApproveInvoice = autoApproveInvoice;
    }
public void setAutoApproveOrder(String autoApproveOrder) {
        this.autoApproveOrder = autoApproveOrder;
    }
public void setShipIfCaptureFails(String shipIfCaptureFails) {
        this.shipIfCaptureFails = shipIfCaptureFails;
    }
public void setSetOwnerUponIssuance(String setOwnerUponIssuance) {
        this.setOwnerUponIssuance = setOwnerUponIssuance;
    }
public void setReqReturnInventoryReceive(String reqReturnInventoryReceive) {
        this.reqReturnInventoryReceive = reqReturnInventoryReceive;
    }
public void setAddToCartRemoveIncompat(String addToCartRemoveIncompat) {
        this.addToCartRemoveIncompat = addToCartRemoveIncompat;
    }
public void setAddToCartReplaceUpsell(String addToCartReplaceUpsell) {
        this.addToCartReplaceUpsell = addToCartReplaceUpsell;
    }
public void setSplitPayPrefPerShpGrp(String splitPayPrefPerShpGrp) {
        this.splitPayPrefPerShpGrp = splitPayPrefPerShpGrp;
    }
public void setManagedByLot(String managedByLot) {
        this.managedByLot = managedByLot;
    }
public void setShowOutOfStockProducts(String showOutOfStockProducts) {
        this.showOutOfStockProducts = showOutOfStockProducts;
    }
public void setOrderDecimalQuantity(String orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity;
    }
public void setAllowComment(String allowComment) {
        this.allowComment = allowComment;
    }
public void setAllocateInventory(String allocateInventory) {
        this.allocateInventory = allocateInventory;
    }

}
