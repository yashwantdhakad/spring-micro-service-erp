package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String primaryStoreGroupId;
    private String storeName;
    private String companyName;
    private String title;
    private String subtitle;
    private String payToPartyId;
    private String daysToCancelNonPay;
    private String manualAuthIsCapture;
    private String prorateShipping;
    private String prorateTaxes;
    private String viewCartOnAdd;
    private String autoSaveCart;
    private String autoApproveReviews;
    private String isDemoStore;
    private String isImmediatelyFulfilled;
    private String inventoryFacilityId;
    private String oneInventoryFacility;
    private String checkInventory;
    private String reserveInventory;
    private String reserveOrderEnumId;
    private String requireInventory;
    private String balanceResOnOrderCreation;
    private String requirementMethodEnumId;
    private String orderNumberPrefix;
    private String defaultLocaleString;
    private String defaultCurrencyUomId;
    private String defaultTimeZoneString;
    private String defaultSalesChannelEnumId;
    private String allowPassword;
    private String defaultPassword;
    private String explodeOrderItems;
    private String checkGcBalance;
    private String retryFailedAuths;
    private String headerApprovedStatus;
    private String itemApprovedStatus;
    private String digitalItemApprovedStatus;
    private String headerDeclinedStatus;
    private String itemDeclinedStatus;
    private String headerCancelStatus;
    private String itemCancelStatus;
    private String authDeclinedMessage;
    private String authFraudMessage;
    private String authErrorMessage;
    private String visualThemeId;
    private String storeCreditAccountEnumId;
    private String usePrimaryEmailUsername;
    private String requireCustomerRole;
    private String autoInvoiceDigitalItems;
    private String reqShipAddrForDigItems;
    private String showCheckoutGiftOptions;
    private String selectPaymentTypePerItem;
    private String showPricesWithVatTax;
    private String showTaxIsExempt;
    private String vatTaxAuthGeoId;
    private String vatTaxAuthPartyId;
    private String enableAutoSuggestionList;
    private String enableDigProdUpload;
    private String prodSearchExcludeVariants;
    private String digProdUploadCategoryId;
    private String autoOrderCcTryExp;
    private String autoOrderCcTryOtherCards;
    private String autoOrderCcTryLaterNsf;
    private String autoOrderCcTryLaterMax;
    private String storeCreditValidDays;
    private String autoApproveInvoice;
    private String autoApproveOrder;
    private String shipIfCaptureFails;
    private String setOwnerUponIssuance;
    private String reqReturnInventoryReceive;
    private String addToCartRemoveIncompat;
    private String addToCartReplaceUpsell;
    private String splitPayPrefPerShpGrp;
    private String managedByLot;
    private String showOutOfStockProducts;
    private String orderDecimalQuantity;
    private String allowComment;
    private String allocateInventory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getPrimaryStoreGroupId() {
        return primaryStoreGroupId;
    }

    public void setPrimaryStoreGroupId(String primaryStoreGroupId) {
        this.primaryStoreGroupId = primaryStoreGroupId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPayToPartyId() {
        return payToPartyId;
    }

    public void setPayToPartyId(String payToPartyId) {
        this.payToPartyId = payToPartyId;
    }

    public String getDaysToCancelNonPay() {
        return daysToCancelNonPay;
    }

    public void setDaysToCancelNonPay(String daysToCancelNonPay) {
        this.daysToCancelNonPay = daysToCancelNonPay;
    }

    public String getManualAuthIsCapture() {
        return manualAuthIsCapture;
    }

    public void setManualAuthIsCapture(String manualAuthIsCapture) {
        this.manualAuthIsCapture = manualAuthIsCapture;
    }

    public String getProrateShipping() {
        return prorateShipping;
    }

    public void setProrateShipping(String prorateShipping) {
        this.prorateShipping = prorateShipping;
    }

    public String getProrateTaxes() {
        return prorateTaxes;
    }

    public void setProrateTaxes(String prorateTaxes) {
        this.prorateTaxes = prorateTaxes;
    }

    public String getViewCartOnAdd() {
        return viewCartOnAdd;
    }

    public void setViewCartOnAdd(String viewCartOnAdd) {
        this.viewCartOnAdd = viewCartOnAdd;
    }

    public String getAutoSaveCart() {
        return autoSaveCart;
    }

    public void setAutoSaveCart(String autoSaveCart) {
        this.autoSaveCart = autoSaveCart;
    }

    public String getAutoApproveReviews() {
        return autoApproveReviews;
    }

    public void setAutoApproveReviews(String autoApproveReviews) {
        this.autoApproveReviews = autoApproveReviews;
    }

    public String getIsDemoStore() {
        return isDemoStore;
    }

    public void setIsDemoStore(String isDemoStore) {
        this.isDemoStore = isDemoStore;
    }

    public String getIsImmediatelyFulfilled() {
        return isImmediatelyFulfilled;
    }

    public void setIsImmediatelyFulfilled(String isImmediatelyFulfilled) {
        this.isImmediatelyFulfilled = isImmediatelyFulfilled;
    }

    public String getInventoryFacilityId() {
        return inventoryFacilityId;
    }

    public void setInventoryFacilityId(String inventoryFacilityId) {
        this.inventoryFacilityId = inventoryFacilityId;
    }

    public String getOneInventoryFacility() {
        return oneInventoryFacility;
    }

    public void setOneInventoryFacility(String oneInventoryFacility) {
        this.oneInventoryFacility = oneInventoryFacility;
    }

    public String getCheckInventory() {
        return checkInventory;
    }

    public void setCheckInventory(String checkInventory) {
        this.checkInventory = checkInventory;
    }

    public String getReserveInventory() {
        return reserveInventory;
    }

    public void setReserveInventory(String reserveInventory) {
        this.reserveInventory = reserveInventory;
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public String getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory;
    }

    public String getBalanceResOnOrderCreation() {
        return balanceResOnOrderCreation;
    }

    public void setBalanceResOnOrderCreation(String balanceResOnOrderCreation) {
        this.balanceResOnOrderCreation = balanceResOnOrderCreation;
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

    public String getOrderNumberPrefix() {
        return orderNumberPrefix;
    }

    public void setOrderNumberPrefix(String orderNumberPrefix) {
        this.orderNumberPrefix = orderNumberPrefix;
    }

    public String getDefaultLocaleString() {
        return defaultLocaleString;
    }

    public void setDefaultLocaleString(String defaultLocaleString) {
        this.defaultLocaleString = defaultLocaleString;
    }

    public String getDefaultCurrencyUomId() {
        return defaultCurrencyUomId;
    }

    public void setDefaultCurrencyUomId(String defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId;
    }

    public String getDefaultTimeZoneString() {
        return defaultTimeZoneString;
    }

    public void setDefaultTimeZoneString(String defaultTimeZoneString) {
        this.defaultTimeZoneString = defaultTimeZoneString;
    }

    public String getDefaultSalesChannelEnumId() {
        return defaultSalesChannelEnumId;
    }

    public void setDefaultSalesChannelEnumId(String defaultSalesChannelEnumId) {
        this.defaultSalesChannelEnumId = defaultSalesChannelEnumId;
    }

    public String getAllowPassword() {
        return allowPassword;
    }

    public void setAllowPassword(String allowPassword) {
        this.allowPassword = allowPassword;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public String getExplodeOrderItems() {
        return explodeOrderItems;
    }

    public void setExplodeOrderItems(String explodeOrderItems) {
        this.explodeOrderItems = explodeOrderItems;
    }

    public String getCheckGcBalance() {
        return checkGcBalance;
    }

    public void setCheckGcBalance(String checkGcBalance) {
        this.checkGcBalance = checkGcBalance;
    }

    public String getRetryFailedAuths() {
        return retryFailedAuths;
    }

    public void setRetryFailedAuths(String retryFailedAuths) {
        this.retryFailedAuths = retryFailedAuths;
    }

    public String getHeaderApprovedStatus() {
        return headerApprovedStatus;
    }

    public void setHeaderApprovedStatus(String headerApprovedStatus) {
        this.headerApprovedStatus = headerApprovedStatus;
    }

    public String getItemApprovedStatus() {
        return itemApprovedStatus;
    }

    public void setItemApprovedStatus(String itemApprovedStatus) {
        this.itemApprovedStatus = itemApprovedStatus;
    }

    public String getDigitalItemApprovedStatus() {
        return digitalItemApprovedStatus;
    }

    public void setDigitalItemApprovedStatus(String digitalItemApprovedStatus) {
        this.digitalItemApprovedStatus = digitalItemApprovedStatus;
    }

    public String getHeaderDeclinedStatus() {
        return headerDeclinedStatus;
    }

    public void setHeaderDeclinedStatus(String headerDeclinedStatus) {
        this.headerDeclinedStatus = headerDeclinedStatus;
    }

    public String getItemDeclinedStatus() {
        return itemDeclinedStatus;
    }

    public void setItemDeclinedStatus(String itemDeclinedStatus) {
        this.itemDeclinedStatus = itemDeclinedStatus;
    }

    public String getHeaderCancelStatus() {
        return headerCancelStatus;
    }

    public void setHeaderCancelStatus(String headerCancelStatus) {
        this.headerCancelStatus = headerCancelStatus;
    }

    public String getItemCancelStatus() {
        return itemCancelStatus;
    }

    public void setItemCancelStatus(String itemCancelStatus) {
        this.itemCancelStatus = itemCancelStatus;
    }

    public String getAuthDeclinedMessage() {
        return authDeclinedMessage;
    }

    public void setAuthDeclinedMessage(String authDeclinedMessage) {
        this.authDeclinedMessage = authDeclinedMessage;
    }

    public String getAuthFraudMessage() {
        return authFraudMessage;
    }

    public void setAuthFraudMessage(String authFraudMessage) {
        this.authFraudMessage = authFraudMessage;
    }

    public String getAuthErrorMessage() {
        return authErrorMessage;
    }

    public void setAuthErrorMessage(String authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
    }

    public String getVisualThemeId() {
        return visualThemeId;
    }

    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }

    public String getStoreCreditAccountEnumId() {
        return storeCreditAccountEnumId;
    }

    public void setStoreCreditAccountEnumId(String storeCreditAccountEnumId) {
        this.storeCreditAccountEnumId = storeCreditAccountEnumId;
    }

    public String getUsePrimaryEmailUsername() {
        return usePrimaryEmailUsername;
    }

    public void setUsePrimaryEmailUsername(String usePrimaryEmailUsername) {
        this.usePrimaryEmailUsername = usePrimaryEmailUsername;
    }

    public String getRequireCustomerRole() {
        return requireCustomerRole;
    }

    public void setRequireCustomerRole(String requireCustomerRole) {
        this.requireCustomerRole = requireCustomerRole;
    }

    public String getAutoInvoiceDigitalItems() {
        return autoInvoiceDigitalItems;
    }

    public void setAutoInvoiceDigitalItems(String autoInvoiceDigitalItems) {
        this.autoInvoiceDigitalItems = autoInvoiceDigitalItems;
    }

    public String getReqShipAddrForDigItems() {
        return reqShipAddrForDigItems;
    }

    public void setReqShipAddrForDigItems(String reqShipAddrForDigItems) {
        this.reqShipAddrForDigItems = reqShipAddrForDigItems;
    }

    public String getShowCheckoutGiftOptions() {
        return showCheckoutGiftOptions;
    }

    public void setShowCheckoutGiftOptions(String showCheckoutGiftOptions) {
        this.showCheckoutGiftOptions = showCheckoutGiftOptions;
    }

    public String getSelectPaymentTypePerItem() {
        return selectPaymentTypePerItem;
    }

    public void setSelectPaymentTypePerItem(String selectPaymentTypePerItem) {
        this.selectPaymentTypePerItem = selectPaymentTypePerItem;
    }

    public String getShowPricesWithVatTax() {
        return showPricesWithVatTax;
    }

    public void setShowPricesWithVatTax(String showPricesWithVatTax) {
        this.showPricesWithVatTax = showPricesWithVatTax;
    }

    public String getShowTaxIsExempt() {
        return showTaxIsExempt;
    }

    public void setShowTaxIsExempt(String showTaxIsExempt) {
        this.showTaxIsExempt = showTaxIsExempt;
    }

    public String getVatTaxAuthGeoId() {
        return vatTaxAuthGeoId;
    }

    public void setVatTaxAuthGeoId(String vatTaxAuthGeoId) {
        this.vatTaxAuthGeoId = vatTaxAuthGeoId;
    }

    public String getVatTaxAuthPartyId() {
        return vatTaxAuthPartyId;
    }

    public void setVatTaxAuthPartyId(String vatTaxAuthPartyId) {
        this.vatTaxAuthPartyId = vatTaxAuthPartyId;
    }

    public String getEnableAutoSuggestionList() {
        return enableAutoSuggestionList;
    }

    public void setEnableAutoSuggestionList(String enableAutoSuggestionList) {
        this.enableAutoSuggestionList = enableAutoSuggestionList;
    }

    public String getEnableDigProdUpload() {
        return enableDigProdUpload;
    }

    public void setEnableDigProdUpload(String enableDigProdUpload) {
        this.enableDigProdUpload = enableDigProdUpload;
    }

    public String getProdSearchExcludeVariants() {
        return prodSearchExcludeVariants;
    }

    public void setProdSearchExcludeVariants(String prodSearchExcludeVariants) {
        this.prodSearchExcludeVariants = prodSearchExcludeVariants;
    }

    public String getDigProdUploadCategoryId() {
        return digProdUploadCategoryId;
    }

    public void setDigProdUploadCategoryId(String digProdUploadCategoryId) {
        this.digProdUploadCategoryId = digProdUploadCategoryId;
    }

    public String getAutoOrderCcTryExp() {
        return autoOrderCcTryExp;
    }

    public void setAutoOrderCcTryExp(String autoOrderCcTryExp) {
        this.autoOrderCcTryExp = autoOrderCcTryExp;
    }

    public String getAutoOrderCcTryOtherCards() {
        return autoOrderCcTryOtherCards;
    }

    public void setAutoOrderCcTryOtherCards(String autoOrderCcTryOtherCards) {
        this.autoOrderCcTryOtherCards = autoOrderCcTryOtherCards;
    }

    public String getAutoOrderCcTryLaterNsf() {
        return autoOrderCcTryLaterNsf;
    }

    public void setAutoOrderCcTryLaterNsf(String autoOrderCcTryLaterNsf) {
        this.autoOrderCcTryLaterNsf = autoOrderCcTryLaterNsf;
    }

    public String getAutoOrderCcTryLaterMax() {
        return autoOrderCcTryLaterMax;
    }

    public void setAutoOrderCcTryLaterMax(String autoOrderCcTryLaterMax) {
        this.autoOrderCcTryLaterMax = autoOrderCcTryLaterMax;
    }

    public String getStoreCreditValidDays() {
        return storeCreditValidDays;
    }

    public void setStoreCreditValidDays(String storeCreditValidDays) {
        this.storeCreditValidDays = storeCreditValidDays;
    }

    public String getAutoApproveInvoice() {
        return autoApproveInvoice;
    }

    public void setAutoApproveInvoice(String autoApproveInvoice) {
        this.autoApproveInvoice = autoApproveInvoice;
    }

    public String getAutoApproveOrder() {
        return autoApproveOrder;
    }

    public void setAutoApproveOrder(String autoApproveOrder) {
        this.autoApproveOrder = autoApproveOrder;
    }

    public String getShipIfCaptureFails() {
        return shipIfCaptureFails;
    }

    public void setShipIfCaptureFails(String shipIfCaptureFails) {
        this.shipIfCaptureFails = shipIfCaptureFails;
    }

    public String getSetOwnerUponIssuance() {
        return setOwnerUponIssuance;
    }

    public void setSetOwnerUponIssuance(String setOwnerUponIssuance) {
        this.setOwnerUponIssuance = setOwnerUponIssuance;
    }

    public String getReqReturnInventoryReceive() {
        return reqReturnInventoryReceive;
    }

    public void setReqReturnInventoryReceive(String reqReturnInventoryReceive) {
        this.reqReturnInventoryReceive = reqReturnInventoryReceive;
    }

    public String getAddToCartRemoveIncompat() {
        return addToCartRemoveIncompat;
    }

    public void setAddToCartRemoveIncompat(String addToCartRemoveIncompat) {
        this.addToCartRemoveIncompat = addToCartRemoveIncompat;
    }

    public String getAddToCartReplaceUpsell() {
        return addToCartReplaceUpsell;
    }

    public void setAddToCartReplaceUpsell(String addToCartReplaceUpsell) {
        this.addToCartReplaceUpsell = addToCartReplaceUpsell;
    }

    public String getSplitPayPrefPerShpGrp() {
        return splitPayPrefPerShpGrp;
    }

    public void setSplitPayPrefPerShpGrp(String splitPayPrefPerShpGrp) {
        this.splitPayPrefPerShpGrp = splitPayPrefPerShpGrp;
    }

    public String getManagedByLot() {
        return managedByLot;
    }

    public void setManagedByLot(String managedByLot) {
        this.managedByLot = managedByLot;
    }

    public String getShowOutOfStockProducts() {
        return showOutOfStockProducts;
    }

    public void setShowOutOfStockProducts(String showOutOfStockProducts) {
        this.showOutOfStockProducts = showOutOfStockProducts;
    }

    public String getOrderDecimalQuantity() {
        return orderDecimalQuantity;
    }

    public void setOrderDecimalQuantity(String orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity;
    }

    public String getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment;
    }

    public String getAllocateInventory() {
        return allocateInventory;
    }

    public void setAllocateInventory(String allocateInventory) {
        this.allocateInventory = allocateInventory;
    }

}