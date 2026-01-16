package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ShipmentRouteSegment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentRouteSegmentId;
    private String deliveryId;
    private String originFacilityId;
    private String destFacilityId;
    private String originContactMechId;
    private String originTelecomNumberId;
    private String destContactMechId;
    private String destTelecomNumberId;
    private String carrierPartyId;
    private String shipmentMethodTypeId;
    private String carrierServiceStatusId;
    private String carrierDeliveryZone;
    private String carrierRestrictionCodes;
    private String carrierRestrictionDesc;
    private String billingWeight;
    private String billingWeightUomId;
    private String actualTransportCost;
    private String actualServiceCost;
    private String actualOtherCost;
    private String actualCost;
    private String currencyUomId;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualArrivalDate;
    private LocalDateTime estimatedStartDate;
    private LocalDateTime estimatedArrivalDate;
    private String trackingIdNumber;
    private String trackingDigest;
    private LocalDateTime updatedByUserLoginId;
    private LocalDateTime lastUpdatedDate;
    private String homeDeliveryType;
    private LocalDateTime homeDeliveryDate;
    private String thirdPartyAccountNumber;
    private String thirdPartyPostalCode;
    private String thirdPartyCountryGeoCode;
    private String upsHighValueReport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentRouteSegmentId() {
        return shipmentRouteSegmentId;
    }

    public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public String getDestFacilityId() {
        return destFacilityId;
    }

    public void setDestFacilityId(String destFacilityId) {
        this.destFacilityId = destFacilityId;
    }

    public String getOriginContactMechId() {
        return originContactMechId;
    }

    public void setOriginContactMechId(String originContactMechId) {
        this.originContactMechId = originContactMechId;
    }

    public String getOriginTelecomNumberId() {
        return originTelecomNumberId;
    }

    public void setOriginTelecomNumberId(String originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }

    public String getDestContactMechId() {
        return destContactMechId;
    }

    public void setDestContactMechId(String destContactMechId) {
        this.destContactMechId = destContactMechId;
    }

    public String getDestTelecomNumberId() {
        return destTelecomNumberId;
    }

    public void setDestTelecomNumberId(String destTelecomNumberId) {
        this.destTelecomNumberId = destTelecomNumberId;
    }

    public String getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getCarrierServiceStatusId() {
        return carrierServiceStatusId;
    }

    public void setCarrierServiceStatusId(String carrierServiceStatusId) {
        this.carrierServiceStatusId = carrierServiceStatusId;
    }

    public String getCarrierDeliveryZone() {
        return carrierDeliveryZone;
    }

    public void setCarrierDeliveryZone(String carrierDeliveryZone) {
        this.carrierDeliveryZone = carrierDeliveryZone;
    }

    public String getCarrierRestrictionCodes() {
        return carrierRestrictionCodes;
    }

    public void setCarrierRestrictionCodes(String carrierRestrictionCodes) {
        this.carrierRestrictionCodes = carrierRestrictionCodes;
    }

    public String getCarrierRestrictionDesc() {
        return carrierRestrictionDesc;
    }

    public void setCarrierRestrictionDesc(String carrierRestrictionDesc) {
        this.carrierRestrictionDesc = carrierRestrictionDesc;
    }

    public String getBillingWeight() {
        return billingWeight;
    }

    public void setBillingWeight(String billingWeight) {
        this.billingWeight = billingWeight;
    }

    public String getBillingWeightUomId() {
        return billingWeightUomId;
    }

    public void setBillingWeightUomId(String billingWeightUomId) {
        this.billingWeightUomId = billingWeightUomId;
    }

    public String getActualTransportCost() {
        return actualTransportCost;
    }

    public void setActualTransportCost(String actualTransportCost) {
        this.actualTransportCost = actualTransportCost;
    }

    public String getActualServiceCost() {
        return actualServiceCost;
    }

    public void setActualServiceCost(String actualServiceCost) {
        this.actualServiceCost = actualServiceCost;
    }

    public String getActualOtherCost() {
        return actualOtherCost;
    }

    public void setActualOtherCost(String actualOtherCost) {
        this.actualOtherCost = actualOtherCost;
    }

    public String getActualCost() {
        return actualCost;
    }

    public void setActualCost(String actualCost) {
        this.actualCost = actualCost;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public LocalDateTime getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public LocalDateTime getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(LocalDateTime actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public LocalDateTime getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public LocalDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getTrackingIdNumber() {
        return trackingIdNumber;
    }

    public void setTrackingIdNumber(String trackingIdNumber) {
        this.trackingIdNumber = trackingIdNumber;
    }

    public String getTrackingDigest() {
        return trackingDigest;
    }

    public void setTrackingDigest(String trackingDigest) {
        this.trackingDigest = trackingDigest;
    }

    public LocalDateTime getUpdatedByUserLoginId() {
        return updatedByUserLoginId;
    }

    public void setUpdatedByUserLoginId(LocalDateTime updatedByUserLoginId) {
        this.updatedByUserLoginId = updatedByUserLoginId;
    }

    public LocalDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getHomeDeliveryType() {
        return homeDeliveryType;
    }

    public void setHomeDeliveryType(String homeDeliveryType) {
        this.homeDeliveryType = homeDeliveryType;
    }

    public LocalDateTime getHomeDeliveryDate() {
        return homeDeliveryDate;
    }

    public void setHomeDeliveryDate(LocalDateTime homeDeliveryDate) {
        this.homeDeliveryDate = homeDeliveryDate;
    }

    public String getThirdPartyAccountNumber() {
        return thirdPartyAccountNumber;
    }

    public void setThirdPartyAccountNumber(String thirdPartyAccountNumber) {
        this.thirdPartyAccountNumber = thirdPartyAccountNumber;
    }

    public String getThirdPartyPostalCode() {
        return thirdPartyPostalCode;
    }

    public void setThirdPartyPostalCode(String thirdPartyPostalCode) {
        this.thirdPartyPostalCode = thirdPartyPostalCode;
    }

    public String getThirdPartyCountryGeoCode() {
        return thirdPartyCountryGeoCode;
    }

    public void setThirdPartyCountryGeoCode(String thirdPartyCountryGeoCode) {
        this.thirdPartyCountryGeoCode = thirdPartyCountryGeoCode;
    }

    public String getUpsHighValueReport() {
        return upsHighValueReport;
    }

    public void setUpsHighValueReport(String upsHighValueReport) {
        this.upsHighValueReport = upsHighValueReport;
    }

}