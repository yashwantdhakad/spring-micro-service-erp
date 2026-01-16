package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductStoreShipmentMeth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreShipMethId;
    private String productStoreId;
    private String shipmentMethodTypeId;
    private String partyId;
    private String roleTypeId;
    private String companyPartyId;
    private String minWeight;
    private String maxWeight;
    private String minSize;
    private String maxSize;
    private String minTotal;
    private String maxTotal;
    private String allowUspsAddr;
    private String requireUspsAddr;
    private String allowCompanyAddr;
    private String requireCompanyAddr;
    private String includeNoChargeItems;
    private String includeFeatureGroup;
    private String excludeFeatureGroup;
    private String includeGeoId;
    private String excludeGeoId;
    private String serviceName;
    private String configProps;
    private String shipmentCustomMethodId;
    private String shipmentGatewayConfigId;
    private String sequenceNumber;
    private String allowancePercent;
    private String minimumPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductStoreShipMethId() {
        return productStoreShipMethId;
    }

    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
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

    public String getCompanyPartyId() {
        return companyPartyId;
    }

    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }

    public String getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getMinSize() {
        return minSize;
    }

    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public String getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(String minTotal) {
        this.minTotal = minTotal;
    }

    public String getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(String maxTotal) {
        this.maxTotal = maxTotal;
    }

    public String getAllowUspsAddr() {
        return allowUspsAddr;
    }

    public void setAllowUspsAddr(String allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr;
    }

    public String getRequireUspsAddr() {
        return requireUspsAddr;
    }

    public void setRequireUspsAddr(String requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr;
    }

    public String getAllowCompanyAddr() {
        return allowCompanyAddr;
    }

    public void setAllowCompanyAddr(String allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr;
    }

    public String getRequireCompanyAddr() {
        return requireCompanyAddr;
    }

    public void setRequireCompanyAddr(String requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr;
    }

    public String getIncludeNoChargeItems() {
        return includeNoChargeItems;
    }

    public void setIncludeNoChargeItems(String includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems;
    }

    public String getIncludeFeatureGroup() {
        return includeFeatureGroup;
    }

    public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup;
    }

    public String getExcludeFeatureGroup() {
        return excludeFeatureGroup;
    }

    public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup;
    }

    public String getIncludeGeoId() {
        return includeGeoId;
    }

    public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId;
    }

    public String getExcludeGeoId() {
        return excludeGeoId;
    }

    public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getConfigProps() {
        return configProps;
    }

    public void setConfigProps(String configProps) {
        this.configProps = configProps;
    }

    public String getShipmentCustomMethodId() {
        return shipmentCustomMethodId;
    }

    public void setShipmentCustomMethodId(String shipmentCustomMethodId) {
        this.shipmentCustomMethodId = shipmentCustomMethodId;
    }

    public String getShipmentGatewayConfigId() {
        return shipmentGatewayConfigId;
    }

    public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getAllowancePercent() {
        return allowancePercent;
    }

    public void setAllowancePercent(String allowancePercent) {
        this.allowancePercent = allowancePercent;
    }

    public String getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

}