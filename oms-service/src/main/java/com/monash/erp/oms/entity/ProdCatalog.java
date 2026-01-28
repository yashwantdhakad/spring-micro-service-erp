package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ProdCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prodCatalogId;
    private String catalogName;
    private String useQuickAdd;
    private String styleSheet;
    private String headerLogo;
    private String contentPathPrefix;
    private String templatePathPrefix;
    private String viewAllowPermReqd;
    private String purchaseAllowPermReqd;
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

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getUseQuickAdd() {
        return useQuickAdd;
    }

    public void setUseQuickAdd(String useQuickAdd) {
        this.useQuickAdd = useQuickAdd;
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet;
    }

    public String getHeaderLogo() {
        return headerLogo;
    }

    public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo;
    }

    public String getContentPathPrefix() {
        return contentPathPrefix;
    }

    public void setContentPathPrefix(String contentPathPrefix) {
        this.contentPathPrefix = contentPathPrefix;
    }

    public String getTemplatePathPrefix() {
        return templatePathPrefix;
    }

    public void setTemplatePathPrefix(String templatePathPrefix) {
        this.templatePathPrefix = templatePathPrefix;
    }

    public String getViewAllowPermReqd() {
        return viewAllowPermReqd;
    }

    public void setViewAllowPermReqd(String viewAllowPermReqd) {
        this.viewAllowPermReqd = viewAllowPermReqd;
    }

    public String getPurchaseAllowPermReqd() {
        return purchaseAllowPermReqd;
    }

    public void setPurchaseAllowPermReqd(String purchaseAllowPermReqd) {
        this.purchaseAllowPermReqd = purchaseAllowPermReqd;
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