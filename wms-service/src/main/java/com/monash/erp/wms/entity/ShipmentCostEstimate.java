package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentCostEstimate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentCostEstimateId;
    private String shipmentMethodTypeId;
    private String carrierPartyId;
    private String carrierRoleTypeId;
    private String productStoreShipMethId;
    private String productStoreId;
    private String partyId;
    private String roleTypeId;
    private String geoIdTo;
    private String geoIdFrom;
    private String weightBreakId;
    private String weightUomId;
    private String weightUnitPrice;
    private String quantityBreakId;
    private String quantityUomId;
    private String quantityUnitPrice;
    private String priceBreakId;
    private String priceUomId;
    private String priceUnitPrice;
    private String orderFlatPrice;
    private String orderPricePercent;
    private String orderItemFlatPrice;
    private String shippingPricePercent;
    private String productFeatureGroupId;
    private String oversizeUnit;
    private String oversizePrice;
    private String featurePercent;
    private String featurePrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentCostEstimateId() {
        return shipmentCostEstimateId;
    }

    public void setShipmentCostEstimateId(String shipmentCostEstimateId) {
        this.shipmentCostEstimateId = shipmentCostEstimateId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    public String getCarrierRoleTypeId() {
        return carrierRoleTypeId;
    }

    public void setCarrierRoleTypeId(String carrierRoleTypeId) {
        this.carrierRoleTypeId = carrierRoleTypeId;
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

    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    public String getGeoIdFrom() {
        return geoIdFrom;
    }

    public void setGeoIdFrom(String geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }

    public String getWeightBreakId() {
        return weightBreakId;
    }

    public void setWeightBreakId(String weightBreakId) {
        this.weightBreakId = weightBreakId;
    }

    public String getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }

    public String getWeightUnitPrice() {
        return weightUnitPrice;
    }

    public void setWeightUnitPrice(String weightUnitPrice) {
        this.weightUnitPrice = weightUnitPrice;
    }

    public String getQuantityBreakId() {
        return quantityBreakId;
    }

    public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public String getQuantityUnitPrice() {
        return quantityUnitPrice;
    }

    public void setQuantityUnitPrice(String quantityUnitPrice) {
        this.quantityUnitPrice = quantityUnitPrice;
    }

    public String getPriceBreakId() {
        return priceBreakId;
    }

    public void setPriceBreakId(String priceBreakId) {
        this.priceBreakId = priceBreakId;
    }

    public String getPriceUomId() {
        return priceUomId;
    }

    public void setPriceUomId(String priceUomId) {
        this.priceUomId = priceUomId;
    }

    public String getPriceUnitPrice() {
        return priceUnitPrice;
    }

    public void setPriceUnitPrice(String priceUnitPrice) {
        this.priceUnitPrice = priceUnitPrice;
    }

    public String getOrderFlatPrice() {
        return orderFlatPrice;
    }

    public void setOrderFlatPrice(String orderFlatPrice) {
        this.orderFlatPrice = orderFlatPrice;
    }

    public String getOrderPricePercent() {
        return orderPricePercent;
    }

    public void setOrderPricePercent(String orderPricePercent) {
        this.orderPricePercent = orderPricePercent;
    }

    public String getOrderItemFlatPrice() {
        return orderItemFlatPrice;
    }

    public void setOrderItemFlatPrice(String orderItemFlatPrice) {
        this.orderItemFlatPrice = orderItemFlatPrice;
    }

    public String getShippingPricePercent() {
        return shippingPricePercent;
    }

    public void setShippingPricePercent(String shippingPricePercent) {
        this.shippingPricePercent = shippingPricePercent;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }

    public String getOversizeUnit() {
        return oversizeUnit;
    }

    public void setOversizeUnit(String oversizeUnit) {
        this.oversizeUnit = oversizeUnit;
    }

    public String getOversizePrice() {
        return oversizePrice;
    }

    public void setOversizePrice(String oversizePrice) {
        this.oversizePrice = oversizePrice;
    }

    public String getFeaturePercent() {
        return featurePercent;
    }

    public void setFeaturePercent(String featurePercent) {
        this.featurePercent = featurePercent;
    }

    public String getFeaturePrice() {
        return featurePrice;
    }

    public void setFeaturePrice(String featurePrice) {
        this.featurePrice = featurePrice;
    }

}