package com.monash.erp.wms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "product_category",
        indexes = {
                @Index(name = "idx_product_category_id", columnList = "PRODUCT_CATEGORY_ID"),
                @Index(name = "idx_product_category_name", columnList = "CATEGORY_NAME")
        }
)
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_CATEGORY_ID", length = 20)
    private String productCategoryId;

    @Column(name = "PRODUCT_CATEGORY_TYPE_ID", length = 20)
    private String productCategoryTypeId;

    @Column(name = "PRIMARY_PARENT_CATEGORY_ID", length = 20)
    private String primaryParentCategoryId;

    @Column(name = "CATEGORY_NAME", length = 100)
    private String categoryName;

    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    @Lob
    @Column(name = "LONG_DESCRIPTION", columnDefinition = "LONGTEXT")
    private String longDescription;

    @Column(name = "CATEGORY_IMAGE_URL", length = 255)
    private String categoryImageUrl;

    @Column(name = "LINK_ONE_IMAGE_URL", length = 255)
    private String linkOneImageUrl;

    @Column(name = "LINK_TWO_IMAGE_URL", length = 255)
    private String linkTwoImageUrl;

    @Column(name = "DETAIL_SCREEN", length = 255)
    private String detailScreen;

    @Column(name = "SHOW_IN_SELECT", length = 1)
    private String showInSelect;

    @Column(name = "LAST_UPDATED_STAMP")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "LAST_UPDATED_TX_STAMP")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "CREATED_STAMP")
    private LocalDateTime createdStamp;

    @Column(name = "CREATED_TX_STAMP")
    private LocalDateTime createdTxStamp;

    @Column(name = "IS_COUNTABLE", length = 1)
    private String isCountable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }

    public String getPrimaryParentCategoryId() {
        return primaryParentCategoryId;
    }

    public void setPrimaryParentCategoryId(String primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    public String getLinkOneImageUrl() {
        return linkOneImageUrl;
    }

    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl;
    }

    public String getLinkTwoImageUrl() {
        return linkTwoImageUrl;
    }

    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl;
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    public String getShowInSelect() {
        return showInSelect;
    }

    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect;
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

    public String getIsCountable() {
        return isCountable;
    }

    public void setIsCountable(String isCountable) {
        this.isCountable = isCountable;
    }
}
