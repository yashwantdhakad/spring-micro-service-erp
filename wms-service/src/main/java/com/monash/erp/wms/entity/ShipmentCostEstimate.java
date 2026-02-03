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
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentCostEstimateId(String shipmentCostEstimateId) {
        this.shipmentCostEstimateId = shipmentCostEstimateId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
public void setCarrierRoleTypeId(String carrierRoleTypeId) {
        this.carrierRoleTypeId = carrierRoleTypeId;
    }
public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }
public void setGeoIdFrom(String geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }
public void setWeightBreakId(String weightBreakId) {
        this.weightBreakId = weightBreakId;
    }
public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }
public void setWeightUnitPrice(String weightUnitPrice) {
        this.weightUnitPrice = weightUnitPrice;
    }
public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }
public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
public void setQuantityUnitPrice(String quantityUnitPrice) {
        this.quantityUnitPrice = quantityUnitPrice;
    }
public void setPriceBreakId(String priceBreakId) {
        this.priceBreakId = priceBreakId;
    }
public void setPriceUomId(String priceUomId) {
        this.priceUomId = priceUomId;
    }
public void setPriceUnitPrice(String priceUnitPrice) {
        this.priceUnitPrice = priceUnitPrice;
    }
public void setOrderFlatPrice(String orderFlatPrice) {
        this.orderFlatPrice = orderFlatPrice;
    }
public void setOrderPricePercent(String orderPricePercent) {
        this.orderPricePercent = orderPricePercent;
    }
public void setOrderItemFlatPrice(String orderItemFlatPrice) {
        this.orderItemFlatPrice = orderItemFlatPrice;
    }
public void setShippingPricePercent(String shippingPricePercent) {
        this.shippingPricePercent = shippingPricePercent;
    }
public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }
public void setOversizeUnit(String oversizeUnit) {
        this.oversizeUnit = oversizeUnit;
    }
public void setOversizePrice(String oversizePrice) {
        this.oversizePrice = oversizePrice;
    }
public void setFeaturePercent(String featurePercent) {
        this.featurePercent = featurePercent;
    }
public void setFeaturePrice(String featurePrice) {
        this.featurePrice = featurePrice;
    }

}
