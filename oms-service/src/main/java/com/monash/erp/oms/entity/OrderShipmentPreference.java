package com.monash.erp.oms.entity;

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
public class OrderShipmentPreference extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String shipmentMethodTypeId;
    private String carrierPartyId;
    private String carrierRoleTypeId;
    private String trackingNumber;
    private String shippingInstructions;
    private String maySplit;
    private String giftMessage;
    private String isGift;
    private LocalDateTime shipAfterDate;
    private LocalDateTime shipBeforeDate;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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
public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

}
