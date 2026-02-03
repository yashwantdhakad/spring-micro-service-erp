package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }
public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
public void setDestFacilityId(String destFacilityId) {
        this.destFacilityId = destFacilityId;
    }
public void setOriginContactMechId(String originContactMechId) {
        this.originContactMechId = originContactMechId;
    }
public void setOriginTelecomNumberId(String originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }
public void setDestContactMechId(String destContactMechId) {
        this.destContactMechId = destContactMechId;
    }
public void setDestTelecomNumberId(String destTelecomNumberId) {
        this.destTelecomNumberId = destTelecomNumberId;
    }
public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setCarrierServiceStatusId(String carrierServiceStatusId) {
        this.carrierServiceStatusId = carrierServiceStatusId;
    }
public void setCarrierDeliveryZone(String carrierDeliveryZone) {
        this.carrierDeliveryZone = carrierDeliveryZone;
    }
public void setCarrierRestrictionCodes(String carrierRestrictionCodes) {
        this.carrierRestrictionCodes = carrierRestrictionCodes;
    }
public void setCarrierRestrictionDesc(String carrierRestrictionDesc) {
        this.carrierRestrictionDesc = carrierRestrictionDesc;
    }
public void setBillingWeight(String billingWeight) {
        this.billingWeight = billingWeight;
    }
public void setBillingWeightUomId(String billingWeightUomId) {
        this.billingWeightUomId = billingWeightUomId;
    }
public void setActualTransportCost(String actualTransportCost) {
        this.actualTransportCost = actualTransportCost;
    }
public void setActualServiceCost(String actualServiceCost) {
        this.actualServiceCost = actualServiceCost;
    }
public void setActualOtherCost(String actualOtherCost) {
        this.actualOtherCost = actualOtherCost;
    }
public void setActualCost(String actualCost) {
        this.actualCost = actualCost;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
public void setActualArrivalDate(LocalDateTime actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }
public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }
public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }
public void setTrackingIdNumber(String trackingIdNumber) {
        this.trackingIdNumber = trackingIdNumber;
    }
public void setTrackingDigest(String trackingDigest) {
        this.trackingDigest = trackingDigest;
    }
public void setUpdatedByUserLoginId(LocalDateTime updatedByUserLoginId) {
        this.updatedByUserLoginId = updatedByUserLoginId;
    }
public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
public void setHomeDeliveryType(String homeDeliveryType) {
        this.homeDeliveryType = homeDeliveryType;
    }
public void setHomeDeliveryDate(LocalDateTime homeDeliveryDate) {
        this.homeDeliveryDate = homeDeliveryDate;
    }
public void setThirdPartyAccountNumber(String thirdPartyAccountNumber) {
        this.thirdPartyAccountNumber = thirdPartyAccountNumber;
    }
public void setThirdPartyPostalCode(String thirdPartyPostalCode) {
        this.thirdPartyPostalCode = thirdPartyPostalCode;
    }
public void setThirdPartyCountryGeoCode(String thirdPartyCountryGeoCode) {
        this.thirdPartyCountryGeoCode = thirdPartyCountryGeoCode;
    }
public void setUpsHighValueReport(String upsHighValueReport) {
        this.upsHighValueReport = upsHighValueReport;
    }

}
