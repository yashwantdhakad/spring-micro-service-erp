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
public class OrderItemGroup extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemGroupSeqId;
    private String parentGroupSeqId;
    private String groupName;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }
public void setParentGroupSeqId(String parentGroupSeqId) {
        this.parentGroupSeqId = parentGroupSeqId;
    }
public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
