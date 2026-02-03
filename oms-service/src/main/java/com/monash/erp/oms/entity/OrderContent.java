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
        name = "order_content",
        indexes = {
                @Index(name = "idx_order_content_order_id", columnList = "order_id"),
                @Index(name = "idx_order_content_order_content", columnList = "order_id, content_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderContent extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String contentId;
    private String orderContentTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String isMandatory;
    private String isPublic;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setOrderContentTypeId(String orderContentTypeId) {
        this.orderContentTypeId = orderContentTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }
public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

}
