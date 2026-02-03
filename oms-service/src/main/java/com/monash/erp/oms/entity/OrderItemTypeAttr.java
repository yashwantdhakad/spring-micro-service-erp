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
public class OrderItemTypeAttr extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderItemTypeId;
    private String attrName;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

}
