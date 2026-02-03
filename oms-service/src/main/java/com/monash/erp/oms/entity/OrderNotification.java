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
public class OrderNotification extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNotificationId;
    private String orderId;
    private String emailType;
    private String comments;
    private LocalDateTime notificationDate;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderNotificationId(String orderNotificationId) {
        this.orderNotificationId = orderNotificationId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setEmailType(String emailType) {
        this.emailType = emailType;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setNotificationDate(LocalDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }

}
