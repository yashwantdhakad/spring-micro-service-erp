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
        name = "order_status",
        indexes = {
                @Index(name = "idx_order_status_order_status_datetime", columnList = "order_id, status_datetime")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderStatus extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderStatusId;
    private String statusId;
    private String orderId;
    private String orderItemSeqId;
    private String orderPaymentPreferenceId;
    private LocalDateTime statusDatetime;
    private String statusUserLogin;
    private String changeReason;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }
public void setStatusDatetime(LocalDateTime statusDatetime) {
        this.statusDatetime = statusDatetime;
    }
public void setStatusUserLogin(String statusUserLogin) {
        this.statusUserLogin = statusUserLogin;
    }
public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

}
