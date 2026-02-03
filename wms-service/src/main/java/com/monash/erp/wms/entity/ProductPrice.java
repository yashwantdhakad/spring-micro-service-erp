package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
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
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }
public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPrice(String price) {
        this.price = price;
    }
public void setTermUomId(String termUomId) {
        this.termUomId = termUomId;
    }
public void setCustomPriceCalcService(String customPriceCalcService) {
        this.customPriceCalcService = customPriceCalcService;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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
public void setOemPartyId(String oemPartyId) {
        this.oemPartyId = oemPartyId;
    }
}
