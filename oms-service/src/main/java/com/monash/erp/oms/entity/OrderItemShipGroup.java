package com.monash.erp.oms.entity;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getSupplierPartyId() {
        return supplierPartyId;
    }

    public void setSupplierPartyId(String supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
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

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getTelecomContactMechId() {
        return telecomContactMechId;
    }

    public void setTelecomContactMechId(String telecomContactMechId) {
        this.telecomContactMechId = telecomContactMechId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;
    }

    public String getMaySplit() {
        return maySplit;
    }

    public void setMaySplit(String maySplit) {
        this.maySplit = maySplit;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public String getIsGift() {
        return isGift;
    }

    public void setIsGift(String isGift) {
        this.isGift = isGift;
    }

    public LocalDateTime getShipAfterDate() {
        return shipAfterDate;
    }

    public void setShipAfterDate(LocalDateTime shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }

    public LocalDateTime getShipByDate() {
        return shipByDate;
    }

    public void setShipByDate(LocalDateTime shipByDate) {
        this.shipByDate = shipByDate;
    }

    public LocalDateTime getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }




    public String getCarrierAccountNumber() {
        return carrierAccountNumber;
    }

    public void setCarrierAccountNumber(String carrierAccountNumber) {
        this.carrierAccountNumber = carrierAccountNumber;
    }

    public String getCarrierService() {
        return carrierService;
    }

    public void setCarrierService(String carrierService) {
        this.carrierService = carrierService;
    }

    public String getIsSaturdayDelivery() {
        return isSaturdayDelivery;
    }

    public void setIsSaturdayDelivery(String isSaturdayDelivery) {
        this.isSaturdayDelivery = isSaturdayDelivery;
    }

}
