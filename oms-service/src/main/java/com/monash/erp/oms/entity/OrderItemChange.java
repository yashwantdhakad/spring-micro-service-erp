package com.monash.erp.oms.entity;

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
public class OrderItemChange extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderItemChangeId;
    private String orderId;
    private String orderItemSeqId;
    private String changeTypeEnumId;
    private LocalDateTime changeDatetime;
    private String changeUserLogin;
    private BigDecimal quantity;
    private BigDecimal cancelQuantity;
    private BigDecimal unitPrice;
    private String itemDescription;
    private String reasonEnumId;
    private String changeComments;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderItemChangeId(String orderItemChangeId) {
        this.orderItemChangeId = orderItemChangeId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setChangeTypeEnumId(String changeTypeEnumId) {
        this.changeTypeEnumId = changeTypeEnumId;
    }
public void setChangeDatetime(LocalDateTime changeDatetime) {
        this.changeDatetime = changeDatetime;
    }
public void setChangeUserLogin(String changeUserLogin) {
        this.changeUserLogin = changeUserLogin;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setChangeComments(String changeComments) {
        this.changeComments = changeComments;
    }

}
