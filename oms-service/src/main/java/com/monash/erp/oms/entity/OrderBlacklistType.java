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
public class OrderBlacklistType extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderBlacklistTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderBlacklistTypeId(String orderBlacklistTypeId) {
        this.orderBlacklistTypeId = orderBlacklistTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
