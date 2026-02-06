package com.monash.erp.wms.dto;

import java.util.List;

public class ProductFeatureDetailResponse {
    private String productFeatureId;
    private String productFeatureTypeId;
    private String productFeatureCategoryId;
    private String description;
    private String uomId;
    private String numberSpecified;
    private String defaultAmount;
    private String defaultSequenceNum;
    private String abbrev;
    private String idCode;
    private List<ProductFeatureApplDto> products;
    private List<ProductFeatureGroupApplDto> groups;

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProductFeatureTypeId() {
        return productFeatureTypeId;
    }

    public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }

    public String getProductFeatureCategoryId() {
        return productFeatureCategoryId;
    }

    public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getNumberSpecified() {
        return numberSpecified;
    }

    public void setNumberSpecified(String numberSpecified) {
        this.numberSpecified = numberSpecified;
    }

    public String getDefaultAmount() {
        return defaultAmount;
    }

    public void setDefaultAmount(String defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public String getDefaultSequenceNum() {
        return defaultSequenceNum;
    }

    public void setDefaultSequenceNum(String defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public List<ProductFeatureApplDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductFeatureApplDto> products) {
        this.products = products;
    }

    public List<ProductFeatureGroupApplDto> getGroups() {
        return groups;
    }

    public void setGroups(List<ProductFeatureGroupApplDto> groups) {
        this.groups = groups;
    }
}
