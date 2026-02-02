package com.monash.erp.wms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "product_price",
        indexes = {
                @Index(name = "idx_product_price_product_id", columnList = "PRODUCT_ID"),
                @Index(name = "idx_product_price_type_id", columnList = "PRODUCT_PRICE_TYPE_ID"),
                @Index(name = "idx_product_price_purpose_id", columnList = "PRODUCT_PRICE_PURPOSE_ID"),
                @Index(name = "idx_product_price_thru_date", columnList = "THRU_DATE"),
                @Index(name = "idx_product_price_from_date", columnList = "FROM_DATE")
        }
)
public class ProductPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_ID", length = 20)
    private String productId;

    @Column(name = "PRODUCT_PRICE_TYPE_ID", length = 20)
    private String productPriceTypeId;

    @Column(name = "PRODUCT_PRICE_PURPOSE_ID", length = 20)
    private String productPricePurposeId;

    @Column(name = "CURRENCY_UOM_ID", length = 20)
    private String currencyUomId;

    @Column(name = "PRODUCT_STORE_GROUP_ID", length = 20)
    private String productStoreGroupId;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "THRU_DATE")
    private LocalDateTime thruDate;

    @Column(name = "PRICE", columnDefinition = "decimal(18,3)")
    private String price;

    @Column(name = "TERM_UOM_ID", length = 20)
    private String termUomId;

    @Column(name = "CUSTOM_PRICE_CALC_SERVICE", length = 20)
    private String customPriceCalcService;

    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name = "CREATED_BY_USER_LOGIN", length = 250)
    private String createdByUserLogin;

    @Column(name = "LAST_MODIFIED_DATE")
    private LocalDateTime lastModifiedDate;

    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN", length = 250)
    private String lastModifiedByUserLogin;

    @Column(name = "LAST_UPDATED_STAMP")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "LAST_UPDATED_TX_STAMP")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "CREATED_STAMP")
    private LocalDateTime createdStamp;

    @Column(name = "CREATED_TX_STAMP")
    private LocalDateTime createdTxStamp;

    @Column(name = "OEM_PARTY_ID", length = 20)
    private String oemPartyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTermUomId() {
        return termUomId;
    }

    public void setTermUomId(String termUomId) {
        this.termUomId = termUomId;
    }

    public String getCustomPriceCalcService() {
        return customPriceCalcService;
    }

    public void setCustomPriceCalcService(String customPriceCalcService) {
        this.customPriceCalcService = customPriceCalcService;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public String getOemPartyId() {
        return oemPartyId;
    }

    public void setOemPartyId(String oemPartyId) {
        this.oemPartyId = oemPartyId;
    }
}
