package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentTypeId;
    private String statusId;
    private String primaryOrderId;
    private String primaryReturnId;
    private String primaryShipGroupSeqId;
    private String picklistBinId;
    private LocalDateTime estimatedReadyDate;
    private LocalDateTime estimatedShipDate;
    private String estimatedShipWorkEffId;
    private LocalDateTime estimatedArrivalDate;
    private String estimatedArrivalWorkEffId;
    private LocalDateTime latestCancelDate;
    private String estimatedShipCost;
    private String currencyUomId;
    private String handlingInstructions;
    private String originFacilityId;
    private String destinationFacilityId;
    private String originContactMechId;
    private String originTelecomNumberId;
    private String destinationContactMechId;
    private String destinationTelecomNumberId;
    private String partyIdTo;
    private String partyIdFrom;
    private String additionalShippingCharge;
    private String addtlShippingChargeDesc;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;

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

    public String getShipmentTypeId() {
        return shipmentTypeId;
    }

    public void setShipmentTypeId(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPrimaryOrderId() {
        return primaryOrderId;
    }

    public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }

    public String getPrimaryReturnId() {
        return primaryReturnId;
    }

    public void setPrimaryReturnId(String primaryReturnId) {
        this.primaryReturnId = primaryReturnId;
    }

    public String getPrimaryShipGroupSeqId() {
        return primaryShipGroupSeqId;
    }

    public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public LocalDateTime getEstimatedReadyDate() {
        return estimatedReadyDate;
    }

    public void setEstimatedReadyDate(LocalDateTime estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }

    public LocalDateTime getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public String getEstimatedShipWorkEffId() {
        return estimatedShipWorkEffId;
    }

    public void setEstimatedShipWorkEffId(String estimatedShipWorkEffId) {
        this.estimatedShipWorkEffId = estimatedShipWorkEffId;
    }

    public LocalDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getEstimatedArrivalWorkEffId() {
        return estimatedArrivalWorkEffId;
    }

    public void setEstimatedArrivalWorkEffId(String estimatedArrivalWorkEffId) {
        this.estimatedArrivalWorkEffId = estimatedArrivalWorkEffId;
    }

    public LocalDateTime getLatestCancelDate() {
        return latestCancelDate;
    }

    public void setLatestCancelDate(LocalDateTime latestCancelDate) {
        this.latestCancelDate = latestCancelDate;
    }

    public String getEstimatedShipCost() {
        return estimatedShipCost;
    }

    public void setEstimatedShipCost(String estimatedShipCost) {
        this.estimatedShipCost = estimatedShipCost;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getHandlingInstructions() {
        return handlingInstructions;
    }

    public void setHandlingInstructions(String handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public String getDestinationFacilityId() {
        return destinationFacilityId;
    }

    public void setDestinationFacilityId(String destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
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

    public String getDestinationContactMechId() {
        return destinationContactMechId;
    }

    public void setDestinationContactMechId(String destinationContactMechId) {
        this.destinationContactMechId = destinationContactMechId;
    }

    public String getDestinationTelecomNumberId() {
        return destinationTelecomNumberId;
    }

    public void setDestinationTelecomNumberId(String destinationTelecomNumberId) {
        this.destinationTelecomNumberId = destinationTelecomNumberId;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getAdditionalShippingCharge() {
        return additionalShippingCharge;
    }

    public void setAdditionalShippingCharge(String additionalShippingCharge) {
        this.additionalShippingCharge = additionalShippingCharge;
    }

    public String getAddtlShippingChargeDesc() {
        return addtlShippingChargeDesc;
    }

    public void setAddtlShippingChargeDesc(String addtlShippingChargeDesc) {
        this.addtlShippingChargeDesc = addtlShippingChargeDesc;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}