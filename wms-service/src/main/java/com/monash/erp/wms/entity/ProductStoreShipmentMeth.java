package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }
public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }
public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }
public void setMinSize(String minSize) {
        this.minSize = minSize;
    }
public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }
public void setMinTotal(String minTotal) {
        this.minTotal = minTotal;
    }
public void setMaxTotal(String maxTotal) {
        this.maxTotal = maxTotal;
    }
public void setAllowUspsAddr(String allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr;
    }
public void setRequireUspsAddr(String requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr;
    }
public void setAllowCompanyAddr(String allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr;
    }
public void setRequireCompanyAddr(String requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr;
    }
public void setIncludeNoChargeItems(String includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems;
    }
public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup;
    }
public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup;
    }
public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId;
    }
public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId;
    }
public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
public void setConfigProps(String configProps) {
        this.configProps = configProps;
    }
public void setShipmentCustomMethodId(String shipmentCustomMethodId) {
        this.shipmentCustomMethodId = shipmentCustomMethodId;
    }
public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }
public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
public void setAllowancePercent(String allowancePercent) {
        this.allowancePercent = allowancePercent;
    }
public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

}
