package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "shipment",
        indexes = {
                @Index(name = "idx_shipment_shipment_id", columnList = "shipment_id"),
                @Index(name = "idx_shipment_primary_order_id", columnList = "primary_order_id"),
                @Index(name = "idx_shipment_status_id", columnList = "status_id"),
                @Index(name = "idx_shipment_picklist_bin_id", columnList = "picklist_bin_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentTypeId(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }
public void setPrimaryReturnId(String primaryReturnId) {
        this.primaryReturnId = primaryReturnId;
    }
public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }
public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }
public void setEstimatedReadyDate(LocalDateTime estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }
public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }
public void setEstimatedShipWorkEffId(String estimatedShipWorkEffId) {
        this.estimatedShipWorkEffId = estimatedShipWorkEffId;
    }
public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }
public void setEstimatedArrivalWorkEffId(String estimatedArrivalWorkEffId) {
        this.estimatedArrivalWorkEffId = estimatedArrivalWorkEffId;
    }
public void setLatestCancelDate(LocalDateTime latestCancelDate) {
        this.latestCancelDate = latestCancelDate;
    }
public void setEstimatedShipCost(String estimatedShipCost) {
        this.estimatedShipCost = estimatedShipCost;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setHandlingInstructions(String handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }
public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
public void setDestinationFacilityId(String destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }
public void setOriginContactMechId(String originContactMechId) {
        this.originContactMechId = originContactMechId;
    }
public void setOriginTelecomNumberId(String originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }
public void setDestinationContactMechId(String destinationContactMechId) {
        this.destinationContactMechId = destinationContactMechId;
    }
public void setDestinationTelecomNumberId(String destinationTelecomNumberId) {
        this.destinationTelecomNumberId = destinationTelecomNumberId;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setAdditionalShippingCharge(String additionalShippingCharge) {
        this.additionalShippingCharge = additionalShippingCharge;
    }
public void setAddtlShippingChargeDesc(String addtlShippingChargeDesc) {
        this.addtlShippingChargeDesc = addtlShippingChargeDesc;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
