package com.monash.erp.oms.entity;

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
        name = "order_item_ship_group",
        indexes = {
                @Index(name = "idx_order_item_ship_group_order_id", columnList = "order_id"),
                @Index(name = "idx_order_item_ship_group_order_ship_group", columnList = "order_id, ship_group_seq_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderItemShipGroup extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String shipGroupSeqId;
    private String shipmentMethodTypeId;
    private String supplierPartyId;
    private String vendorPartyId;
    private String carrierPartyId;
    private String carrierRoleTypeId;
    private String facilityId;
    private String contactMechId;
    private String telecomContactMechId;
    private String trackingNumber;
    private String shippingInstructions;
    private String maySplit;
    private String giftMessage;
    private String isGift;
    private LocalDateTime shipAfterDate;
    private LocalDateTime shipByDate;
    private LocalDateTime estimatedShipDate;
    private LocalDateTime estimatedDeliveryDate;
    private String carrierAccountNumber;
    private String carrierService;
    private String isSaturdayDelivery;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setSupplierPartyId(String supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }
public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }
public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
public void setCarrierRoleTypeId(String carrierRoleTypeId) {
        this.carrierRoleTypeId = carrierRoleTypeId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setTelecomContactMechId(String telecomContactMechId) {
        this.telecomContactMechId = telecomContactMechId;
    }
public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;
    }
public void setMaySplit(String maySplit) {
        this.maySplit = maySplit;
    }
public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }
public void setIsGift(String isGift) {
        this.isGift = isGift;
    }
public void setShipAfterDate(LocalDateTime shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }
public void setShipByDate(LocalDateTime shipByDate) {
        this.shipByDate = shipByDate;
    }
public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }
public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
public void setCarrierAccountNumber(String carrierAccountNumber) {
        this.carrierAccountNumber = carrierAccountNumber;
    }
public void setCarrierService(String carrierService) {
        this.carrierService = carrierService;
    }
public void setIsSaturdayDelivery(String isSaturdayDelivery) {
        this.isSaturdayDelivery = isSaturdayDelivery;
    }

}
