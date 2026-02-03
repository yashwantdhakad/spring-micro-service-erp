package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ReturnItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String returnId;
    private String returnItemSeqId;
    private String returnReasonId;
    private String returnTypeId;
    private String returnItemTypeId;
    private String productId;
    private String description;
    private String orderId;
    private String orderItemSeqId;
    private String statusId;
    private String expectedItemStatus;
    private BigDecimal returnQuantity;
    private BigDecimal receivedQuantity;
    private BigDecimal returnPrice;
    private String returnItemResponseId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
public void setReturnReasonId(String returnReasonId) {
        this.returnReasonId = returnReasonId;
    }
public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }
public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setExpectedItemStatus(String expectedItemStatus) {
        this.expectedItemStatus = expectedItemStatus;
    }
public void setReturnQuantity(BigDecimal returnQuantity) {
        this.returnQuantity = returnQuantity;
    }
public void setReceivedQuantity(BigDecimal receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
public void setReturnPrice(BigDecimal returnPrice) {
        this.returnPrice = returnPrice;
    }
public void setReturnItemResponseId(String returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
